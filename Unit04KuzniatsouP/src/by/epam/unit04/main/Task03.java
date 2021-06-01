package by.epam.unit04.main;

import java.util.Random;

public class Task03 {

    public static void main(String[] args) {

        int s;
        s=10;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        double[] mass = new double[s];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = -100 + rand.nextInt(100 - (-100));
        }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("[%3.0f] ", mass[i]);
        }
        System.out.println("\n");

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0) {
                positive++;
            }
            if (mass[i] < 0) {
                negative++;
            }
            if (mass[i] == 0) {
                zero++;
            }
        }

        System.out.println("Результат (количество элементов): ");
        System.out.println("- " + positive + " положительных");
        System.out.println("- " + negative + " отрицательных");
        System.out.println("- " + zero + " нулевых");
    }
}
