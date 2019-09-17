package com.enigma.model;

public class Sniper extends Weapon{
private int attach;
private int range ;
private final   int jarak = 100;

    public Sniper(Integer amo,Integer range){
        super(amo);
        this.amo=amo;
        this.range=range;
    }
    public void senjata(String senjata){
        if (senjata.equals("AWM")){
             this.attach = 1;
        }else if (senjata.equals("VSS")){
            this.attach=2;
        }
    }
    public String command(){
            if (this.range<=this.jarak){
               return "target Terbunuh";
                //return  "sisa "+this.amo;
            }else {
                return "Jarak terlalu jauh";
            }
    }
    public String shot(){
        if (this.amo>0){
            for (int i=0;i<=this.amo;i++){
                System.out.println(command());
                this.amo--;
                break;
            }
            return  "";
        }else {
            return "tidak ada peluru";
        }
    }
    public String print() {
        return "" +
                "Sisa peluru" + amo +" ";
    }
}

