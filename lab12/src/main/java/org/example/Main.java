package org.example;

import java.util.*;

public class Main {
    public static void printLow(List<Doctor> doctors) {
        for (Doctor d : doctors) {
            if (d.getAverageRating() < 3) {
                System.out.println(d);
            }
        }
    }

    public static void upRating(List<Doctor> doctors) {
        for (Doctor d : doctors) {
            if (d.getAverageRating() >= 4) {
                d.setRating(d.getRating() + 1);
            }
        }
    }

    public static void printDoctors(List<Doctor> doctors, int rating) {
        for (Doctor d : doctors) {
            if (d.getRating() > rating) {
                System.out.println(d);
            }
        }
    }

    public static void sortAndPrint(List<Doctor> doctors) {
        doctors.sort(Comparator.comparingDouble(Doctor::getAverageRating)
                .thenComparing(Doctor::getName).reversed());
        for (Doctor d : doctors) {
            System.out.println(d.getId() + " | " + d.getName() + " | " + d.getAverageRating());
        }
    }
    static void main() {
        BoardGame bg1 = new BoardGame("Catan", 1, 4.5, 4);
        BoardGame bg2 = new BoardGame("Monopoly", 2, 3.8, 6);
        BoardGame bg3 = new BoardGame("Carcassonne", 3, 4.7, 5);

        CardGame cg1 = new CardGame("Poker", 4, 4.6, "52-card");
        CardGame cg2 = new CardGame("Durak", 5, 4.8, "36-card");
        CardGame cg3 = new CardGame("Uno", 6, 3.9, "Uno deck");

        VideoGame vg1 = new VideoGame("The Witcher 3", 7, 4.9, "PC");
        VideoGame vg2 = new VideoGame("God of War", 8, 4.8, "PlayStation 5");

        Map<String, Game> map=new HashMap<>();
        map.put(bg1.name, bg1);
        map.put(bg2.name, bg2);
        map.put(bg3.name, bg3);
        map.put(cg1.name, cg1);
        map.put(cg2.name, cg2);
        map.put(cg3.name, cg3);
        map.put(vg1.name, vg1);
        map.put(vg2.name, vg2);

        System.out.println("Вывод всех ключей мапа: ");
        for(String name:map.keySet()){
            System.out.println(name);
        }
        System.out.println("\n------------\n\nВывод всех значений мапа: ");
        for(Game game:map.values()){
            game.printInfo();
            System.out.println();
        }

        System.out.println("\n\n-----Задание 2-----\n\n");

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor(1, "Ivanov", "Therapist", 80, List.of(5, 4, 5)));
        doctors.add(new Doctor(2, "Petrov", "Surgeon", 50, List.of(2, 3, 2)));
        doctors.add(new Doctor(3, "Sidorov", "Cardiologist", 70, List.of(4, 4, 4)));
        doctors.add(new Doctor(4, "Kuznetsov", "Neurologist", 60, List.of(3, 5, 4)));
        doctors.add(new Doctor(5, "Smirnov", "Dentist", 90, List.of(5, 5, 4)));

        System.out.println("Начальный список: ");
        doctors.forEach(System.out::println);

        System.out.println("\n1. Врачи со средним рейтингом < 3:");
        printLow(doctors);
        System.out.println("\n2. Повышаем рейтинг при среднем >= 4:");
        upRating(doctors);
        doctors.forEach(System.out::println);
        System.out.println("\n3. Печать врачей с рейтингом > 70:");
        printDoctors(doctors, 70);
        System.out.println("\n4. Сортировка по среднему рейтингу (убывание) и имени");
        sortAndPrint(doctors);
    }
}
