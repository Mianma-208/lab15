package org.example;

import java.awt.*;

public class ResidentialBuilding extends Building{
    private int apartments;
    public ResidentialBuilding(String address, int floors, double area, int apartments){
        super(address,floors,area);
        this.apartments=apartments;
    }
    @Override
    public void getPurpose(){
        System.out.println("Жилой дом");
    }
    @Override
    public int calculateCapacity(){
        return apartments*3;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("\nКоличество квартир: "+apartments);
    }

}
