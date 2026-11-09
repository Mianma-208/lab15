package org.example;

public class Ship implements Transportable, Maintainable{
    private String brand;
    private int capacity;
    private int tonnage;
    private String serviceDate;

    public Ship(String brand, int capacity, int tonnage, String serviceDate) {
        this.brand = brand;
        this.capacity = capacity;
        this.tonnage = tonnage;
        this.serviceDate = serviceDate;
    }

    @Override
    public void transport(){
        System.out.println(brand+" транспартирует");
    }

    @Override
    public int getCapacity(){
        return capacity;
    }

    @Override
    public void maintain(){
        System.out.println(brand+" перевозит груз");
    }

    @Override
    public String getServiceDate(){
        return serviceDate;
    }


}
