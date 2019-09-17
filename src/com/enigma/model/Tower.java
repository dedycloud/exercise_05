package com.enigma.model;

public class Tower implements HitAble,Offensive {
    Integer hp;
    Integer damage;
    public Tower(Integer hp, Integer damage)
    {
        this.hp=hp;
        this.damage= damage;
    }

    @Override
    public void getHit(Integer damage) {
        this.hp=this.hp-damage;
    }

    @Override
    public void attack(HitAble hitAble) {
        hitAble.getHit(this.damage);
    }

    public String print() {
        return "Tower{" +
                "hp=" + hp +
                '}';
    }
}
