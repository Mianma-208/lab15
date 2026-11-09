package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        final String BASE = "D:\\java\\labs\\music.txt";

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);



        System.out.println("---Задание 1---\n");
        File song = new File(BASE);
        System.out.println("Имя: " + song.getName());
        System.out.println("Размер: " + song.length() + " байт");
        System.out.println("Изменён: " + song.lastModified());
        System.out.println("Путь: " + song.getAbsolutePath());
        System.out.println("Содержимое:");
        Path path = song.toPath();
        Files.readAllLines(path).forEach(System.out::println);



        System.out.println("\n---Задание 2---\n");
        Path f = Paths.get("f.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(f)) {
            System.out.println("Введи 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int v = scanner.nextInt();
                bw.write(Integer.toString(v));
                bw.newLine();
            }
        }

        int count = 0;
        System.out.println("Числа из файла:");
        try (BufferedReader br = Files.newBufferedReader(f)) {
            String line;
            while ((line = br.readLine()) != null) {
                int v = Integer.parseInt(line.trim());
                System.out.println(v);
                if (v > 0) {
                    int t = v;
                    while (t % 2 == 0) t /= 2;
                    if (t == 1) count++;
                }
            }
        }
        System.out.println("Количество степеней двойки: " + count);



        System.out.println("\n---Задание 3---\n");
        Path f2 = Paths.get("f2.txt");
        Path g = Paths.get("g.txt");
        Path h = Paths.get("h.txt");
        Random rnd = new Random();

        try (BufferedWriter bw = Files.newBufferedWriter(f2)) {
            for (int i = 0; i < 20; i++) {
                bw.write(Integer.toString(rnd.nextInt(200) - 100)); // [-100..99]
                bw.newLine();
            }
        }

        try (BufferedReader br = Files.newBufferedReader(f2);
             BufferedWriter bwG = Files.newBufferedWriter(g);
             BufferedWriter bwH = Files.newBufferedWriter(h)) {

            String line;
            while ((line = br.readLine()) != null) {
                int v = Integer.parseInt(line.trim());

                int t = Math.abs(v);
                int sum = 0;
                while (t > 0) { sum += t % 10; t /= 10; }

                if (sum % 2 == 0) {
                    bwG.write(line); bwG.newLine();
                } else {
                    bwH.write(line); bwH.newLine();
                }
            }
        }

        System.out.println("f2: " + Files.readAllLines(f2));
        System.out.println("g (сумма цифр чётна): " + Files.readAllLines(g));
        System.out.println("h (остальные): " + Files.readAllLines(h));




        System.out.println("\n---Задание 4---\n");
        Path ang = Paths.get("angles.txt");

        try (BufferedWriter bw = Files.newBufferedWriter(ang)) {
            System.out.println("Введи 10 углов в градусах:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Угол " + (i + 1) + ": ");
                double v = scanner.nextDouble();
                bw.write(Double.toString(v));
                bw.newLine();
            }
        }

        double sum = 0;
        int n = 0;
        try (BufferedReader br = Files.newBufferedReader(ang)) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line.trim());
                n++;
            }
        }
        System.out.printf("Средний угол: %.3f градусов%n", sum / n);



        System.out.println("\n---Задание 5---\n");
        Path f5 = Paths.get("f5.txt");

        int[] nums = {-5, 3, -1, 0, 7, -9, 2, -4, 8, -2};
        try (BufferedWriter bw = Files.newBufferedWriter(f5)) {
            for (int v : nums) {
                bw.write(Integer.toString(v));
                bw.newLine();
            }
        }

        int neg = 0;
        try (BufferedReader br = Files.newBufferedReader(f5)) {
            String line;
            while ((line = br.readLine()) != null) {
                int v = Integer.parseInt(line.trim());
                if (v < 0) neg++;
            }
        }
        System.out.println("Чисел меньше 0: " + neg);
    }
}