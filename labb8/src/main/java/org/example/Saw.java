package org.example;

public class Saw extends Tool{
    private double bladeLength;

    public Saw(String n, int p, double w, double bl){
        super(n,p,w);
        bladeLength=bl;
    }
    public void use(){
        System.out.println("Режит материалы");
    }
    public void sharpenBlade(){
        System.out.println("Лезвие пилы "+name+" заточено");
    }
}

