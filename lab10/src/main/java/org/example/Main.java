package org.example;

public class Main {
    static void main() {

//        Transportable[] mas=new Transportable[]{
//                new Truck("BMB",5,"21-09-2025"),
//                new Truck("Volvo",8,"21-02-2023"),
//                new Truck("Белаз",3,"11-05-2026"),
//                new Ship("Evergreen",100, 5200, "27-12-2025"),
//                new Ship("Shipses",80, 2200, "23-11-2022")
//        };
//        for(Transportable item:mas){
//            item.transport();
//            System.out.println("Вместимость: "+item.getCapacity());
//            ((Maintainable) item).maintain();
//            System.out.println("Дата тех обслуживания: "+((Maintainable) item).getServiceDate());
//        }

        Maintainable m1=new Truck("BMB",5,"21-09-2025");
        System.out.println(m1.id);
        m1.printInterface();
        Maintainable.print();
        m1.maintain();
    }
}
