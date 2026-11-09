package org.example;

public class Drill extends Tool{
    private int speed;
    public Drill(String n, int p, double w, int s){
        super(n,p,w);
        speed=s;
    }
    public void use(){
        System.out.println("Сверлит отверстия");
    }
    public void changeDrillBit(){
        System.out.println("Сменили биту у "+name);
    }
    public String displayInfo(){
        System.out.println(super.name);
        return super.displayInfo()+"Скорость вращения: "+speed;
    }
}