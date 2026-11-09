package org.example;

public interface Maintainable {
    public static final int id=1;
    void maintain();
    String getServiceDate();
    default void printInterface(){
        System.out.println("Maintainable");
    }
    private int getId2(){
        return id*2;
    }
    static void print(){
        System.out.println("Интерфейс");
    }
}
