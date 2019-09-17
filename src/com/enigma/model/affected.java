package com.enigma.model;

public abstract  class affected implements HitAble {

    public void getSkilled(affected affected, Integer damage ) {
        affected.getHit(damage);
    }
}
