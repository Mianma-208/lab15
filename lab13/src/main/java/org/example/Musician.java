package org.example;

import java.io.Console;

public class Musician {
    private String name;
    private String instrument;
    private String genre;
    private int albums;
    private double rating;

    public Musician(String name, String instrument, String genre, int albums, double rating)
            throws InvalidMusicianDataException, AlbumException {
        setName(name);
        setInstrument(instrument);
        setGenre(genre);
        setAlbums(albums);
        setRating(rating);
    }

    public void setName(String name) throws InvalidMusicianDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidMusicianDataException("Имя музыканта не может быть пустым.");
        }
        this.name = name;
    }

    public void setInstrument(String instrument) throws InvalidMusicianDataException {
        if (instrument == null || instrument.trim().isEmpty()) {
            throw new InvalidMusicianDataException("Название инструмента не может быть пустым");
        }
        this.instrument = instrument;
    }

    public void setGenre(String genre) throws InvalidMusicianDataException {
        if (genre == null || genre.trim().isEmpty()) {
            throw new InvalidMusicianDataException("Название жанра не может быть пустым");
        }
        this.genre = genre;
    }

    public void setAlbums(int albums) throws AlbumException {
        if (albums < 0) {
            throw new AlbumException("Количество альбомов не может быть отрицательным: " + albums);
        }
        this.albums = albums;
    }

    public void setRating(double rating) throws InvalidMusicianDataException {
        if (rating < 1.0 || rating > 10.0) {
            throw new InvalidMusicianDataException("Рейтинг должен быть в диапазоне от 1 до 10.");
        }
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getInstrument() { return instrument; }
    public String getGenre() { return genre; }
    public int getAlbums() { return albums; }
    public double getRating() { return rating; }

    public void releaseAlbum(String title) throws InvalidMusicianDataException{
        if (title == null || title.trim().isEmpty()) {
            throw new InvalidMusicianDataException("Название название альбома не может быть пустым");
        }
        System.out.println("Альбом успешно записан");
        albums++;
    }

    public void updateRating(double newRating) throws InvalidMusicianDataException{
        setRating(newRating);
        System.out.println("Новый рейтинг успешно установлен");
    }

    @Override
    public String toString() {
        return "Name= " + name + "\nInstrument= " + instrument +"\nGenre= " + genre + "\nAlbums= " + albums + "\nRating=" + rating+"\n";
    }
}
