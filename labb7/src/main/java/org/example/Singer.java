package org.example;

public class Singer {
    private String name;
    private String genre;
    private int albums;
    private static int totalSingers;
    private static int totalAlbums;

    public static void staticShow(){
        System.out.println("Всего певцов: "+totalSingers+"\nВсего альбомов: "+totalAlbums);
    }
    public void Show(){
        System.out.println("Имя :"+name+"\nЖанр: "+genre+"\nАльбомы у певца: "+albums+"\nВсего певцов: "+totalSingers+"\nВсего альбомов: "+totalAlbums);
    }
    public Singer(String n, String g, int al){
        name=n;
        genre=g;
        albums=al;
        totalSingers++;
        totalAlbums+=al;
    }

    public static double getAverageAlbums(){
        return (double)totalAlbums/totalSingers;
    }
}
