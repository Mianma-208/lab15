package org.example;

public class VideoGame extends Game {
    private String platform;

    public VideoGame(String name, int id, double rating, String platform) {
        super(name, id, rating);
        this.platform = platform;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Platform: " + platform);
    }
}