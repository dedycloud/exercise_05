package com.enigma.model;

public class Weapon {
protected  Integer amo; //peluru
protected Integer range; //jarak

public Weapon(Integer amo){
    this.amo= amo;
}
    public String shot(){
        if (this.amo>0){
            for (int i=0;i<=this.amo;i++){
                this.amo--;
                System.out.println(""+this.amo);
            }
            return  "Sisa Peluru =   "+this.amo;
        }else {
            return "tidak ada peluru";
        }
    }
    public String print() {
        return "Weapon{" +
                "amo=" + amo +
                ", range=" + range +
                ", mag=" + shot() +
                '}';
    }
}
