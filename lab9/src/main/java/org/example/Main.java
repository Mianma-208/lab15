package org.example;

public class Main {
    static void main() {
        Building[] mas=new Building[]{
                new OfficeBuilding("Рафиево",9,120,5),
                new OfficeBuilding("Дзержинского",18,5220,12),
                new OfficeBuilding("Алибегова",12,1220,8),
                new ResidentialBuilding("Рафиево",9,1220,120),
                new ResidentialBuilding("Белецкого",9,1220,110)
        };
Building building =  new OfficeBuilding("Рафиево",9,120,5);
OfficeBuilding officeBuilding =  new OfficeBuilding("Рафиево",9,120,5);
officeBuilding.test();
officeBuilding.test1();

building.test();

//        for( Building item : mas){
//            item.displayInfo();
//            item.getPurpose();
//            System.out.println("Вместимость :"+item.calculateCapacity()+" человек");
//            System.out.println("\n----------------\n");
//        }
    }
}
