package org.example;

import java.awt.image.DataBufferInt;

public class Main {
    static void main(){
        Device[] devices = new Device[5];
        devices[0] = new Tv("Samsung", 150, 2022, 1080);
        devices[1] = new Tv("LG", 120, 2023, 2160);
        devices[2] = new Fridge("Bosch", 200, 2021, -18);
        devices[3] = new Fridge("Xioami", 180, 2020, -20);
        devices[4] = new Fridge("Atlant", 220, 2019, -22);

        for(Device item:devices){
            item.printModel();
            item.turnOn();
            item.turnOn(120);
            item.turnOn("среднюю");
            System.out.println("Энерго класс: "+item.getEnergyClass()+"\n\n---------\n");
        }
    }
}
