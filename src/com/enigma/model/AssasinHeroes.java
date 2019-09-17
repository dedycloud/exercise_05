package com.enigma.model;

public class AssasinHeroes extends Heroes{
    public AssasinHeroes(String namaHero,Integer hp ,Integer nama ,Integer damage,Skill skill){
        super(namaHero,hp,nama,damage,skill);
    }


    public String print() {
        return "AssasinHeroes{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                ", namaHero='" + namaHero + '\'' +
                ", skill=" + skill +
                '}';
    }
}
