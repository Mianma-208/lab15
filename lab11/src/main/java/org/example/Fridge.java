package org.example;

public class Fridge extends Device {
    private int minTemp;

    public Fridge(String model, int power, int year, int minTemp) {
        super(model, power, year);
        this.minTemp=minTemp;
    }

    @Override
    public String getEnergyClass() {
        return "Низкий";
    }
}