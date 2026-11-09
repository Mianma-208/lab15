package org.example;

public class BoardGame extends Game{
    private int players;

    public BoardGame(String name,int id, double rating, int players){
        super(name,id,rating);
        this.players=players;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Players: " + players);
    }
}
