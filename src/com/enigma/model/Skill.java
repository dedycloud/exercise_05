package com.enigma.model;

public class Skill {
private String skillName;
private Integer damage;
private Integer manaCost;
//private Skill skill;
public Skill(String skillName, Integer damage,Integer manaCost){
    this.skillName=skillName;
    this.damage=damage;
    this.manaCost=manaCost;
    //this.skill = skill;
}
public void  castSkill(affected affected){
affected.getSkilled(affected,this.damage);
}
public void decreaseMana(Heroes heroes){
    heroes.decreaseMana(this.manaCost);
}
}
