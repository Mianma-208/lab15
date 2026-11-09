package org.example;

public class Main {
    static void main() {
        MusicLabel sonyMusic = new MusicLabel("Sony Music");

        try {
            Musician m1 = new Musician("Kurt Cobain", "Guitar", "Grunge", 3, 9.5);
            Musician m2 = new Musician("B.B. King", "Guitar", "Blues", 20, 9.9);

            System.out.println("\n--- Выводим данные ---");
            System.out.println(m1);
            System.out.println(m2);

            sonyMusic.addMusician(m1);
            sonyMusic.addMusician(m2);

            System.out.println("\n--- Выпускаем альбомы ---");
            m1.releaseAlbum("In Utero");
            m2.releaseAlbum("Live at the Regal");

            System.out.println("\n--- Обновляем рейтинг ---");
            m1.updateRating(9.8);

            System.out.println("\n--- Выводим данные снова ---");
            System.out.println(m1);
            System.out.println(m2);


        } catch (InvalidMusicianDataException | AlbumException e) {
            System.err.println("Ошибка данных музыканта: " + e.getMessage());
        }

    }
}
