package org.example;

public class CardGame extends Game {
    private String deckType;

    public CardGame(String name, int id, double rating, String deckType) {
        super(name, id, rating);
        this.deckType = deckType;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Deck type: " + deckType);
    }
}