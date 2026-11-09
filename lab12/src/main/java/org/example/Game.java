package org.example;

public class Game {
    protected String name;
    protected int id;
    protected double rating;

    public Game(){}
    public Game(String name,int id, double rating){
        this.name=name;
        this.id=id;
        this.rating=rating;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Rating: " + rating);
    }
}
