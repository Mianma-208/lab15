package org.example;

public class Tool {
    protected String name;
    protected int power;
    protected double weight;

    public Tool(String name, int power, double weight){
        this.name=name;
        this.power=power;
        this.weight=weight;
    }

    public Tool(){
        this("Инструмент",0,0);
    }

    public String getName(){return name;}
    public void setName(String n){
        name=n;
    }

    public int getPower(){return power;}
    public void setPower(int p){
        power=p;
    }

    public double getWeight(){return weight;}
    public void setWeight(double w){
        weight=w;
    }

    public void use(){
        System.out.println("Используется инструмент");
    }

    public String displayInfo(){
        return "Название"+name+"\nМощность: "+power+"\nВес: "+weight;
    }
}
