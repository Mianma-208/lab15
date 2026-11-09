package org.example;

public class OfficeBuilding extends Building{
    private int companies;
    public OfficeBuilding(String address, int floors, double area, int companies){
        super(address,floors,area);
        this.companies=companies;
    }
    @Override
    public void getPurpose(){
        System.out.println("Офисное здание");
    }
    @Override
    public int calculateCapacity(){
        return companies*10;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("\nКоличество компаний: "+companies);
    }
    public void test1(){
        System.out.println("test1");
    }
}
