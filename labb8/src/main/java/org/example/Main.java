package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Tool[] mas=new Tool[]{
                new Drill("Drill1",100,1.2,300),
                new Drill("Drill2",120,1.5,500),
                new Drill("Drill3",220,2,1000),
                new Saw("Saw1",40,2.3,30),
                new Saw("Saw2",50,2.9,40)
        };

        for(Tool item:mas){
            if(item instanceof Drill drill){
                drill.changeDrillBit();
            }
            if(item instanceof Saw saw){
                saw.sharpenBlade();
            }
        }

    }
}
