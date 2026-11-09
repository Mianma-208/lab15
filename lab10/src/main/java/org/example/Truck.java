package org.example;

public class Truck implements Transportable, Maintainable{
    private String brand;
    private int capacity;
    private String serviceDate;

    public Truck(String brand, int capacity, String serviceDate) {
        this.brand = brand;
        this.capacity = capacity;
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
