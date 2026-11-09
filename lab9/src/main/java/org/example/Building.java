package org.example;

public abstract class Building {
    protected String address;
    protected int floors;
    protected double area;

    public Building(String address, int floors, double area){
        this.address=address;
        this.floors=floors;
        this.area=area;
    }

    public String getAddress() {return address;}
    public void setAddress(String address){
        this.address=address;
    }

    public int getFloors(){return floors;}
    public void setFloors(int floors){
        this.floors=floors;
    }

    public double getArea(){return floors;}
    public void setArea(double area){
        this.area=area;
    }

    public abstract void getPurpose();
    public abstract int calculateCapacity();

    public void displayInfo(){
        System.out.print("Адресс :"+address+"\nКоличество этажей :"+floors+"\nПлощадь :"+area);
    }
    public void test(){
        System.out.println("test");
    }
}
