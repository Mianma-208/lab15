package org.example;

public class Tv extends Device {
    private int dig;

    public Tv(String model, int power, int year, int dig) {
        super(model, power, year);
        this.dig=dig;
    }

    @Override
    public String getEnergyClass() {
        return "Высокий";
    }
}