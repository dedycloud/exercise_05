package com.enigma.model;

import java.util.Objects;

public class Heroes extends affected implements HitAble,Offensive {
    private String name;
    Integer hp;
    Integer mana;
    Integer baseDamage;
    String namaHero;
    Skill skill;

    public Heroes(String namaHero ,Integer hp, Integer mana, Integer baseDamage, Skill skill) {
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
        this.skill = skill;
        this.namaHero=namaHero;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroes heroes = (Heroes) o;
        return Objects.equals(name, heroes.name) &&
                Objects.equals(hp, heroes.hp) &&
                Objects.equals(mana, heroes.mana) &&
                Objects.equals(baseDamage, heroes.baseDamage) &&
                Objects.equals(namaHero, heroes.namaHero) &&
                Objects.equals(skill, heroes.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, mana, baseDamage, namaHero, skill);
    }

    public void attack(Heroes heroes){
        heroes.getHit(this.baseDamage);
    }
    @Override
    public void attack(HitAble hitAble) {
        hitAble.getHit(this.baseDamage);
    }

    public void decreaseMana(Integer manaCost){
        this.mana=this.mana-manaCost;
    }
     public void castSkill(affected affected) {
        skill.castSkill(affected);
        skill.decreaseMana(this);
    }




    public void getHit(Integer damage) {
        this.hp=this.hp-damage;
    }

//public void decreaseMana(String mana){
//        this.mana -= mana;
//}
    public String print() {
        return "Heroes{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", Nama Hero=" + namaHero +
                ", baseDamage=" + baseDamage +
                '}';
    }
}
