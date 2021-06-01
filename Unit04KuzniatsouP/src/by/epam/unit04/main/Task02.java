package by.epam.unit04.main;

import java.util.Random;

public class Task02 {

    public static void main(String[] args) {

        int min, max, s;
        s = 8;
        int[] mass = new int[s];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(1000);
        }

        System.out.print("Массив: ");
                for (int i = 0; i < mass.length; i++) {
            System.out.printf("[%3d] ", mass[i]);
        }
        System.out.println("\n");

                min = mass[0];
        max = mass[s-1];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > min) {
                max = mass[i];
            }
        }
        System.out.println("Результат: min = " + min + ", max = " + max + ", d = " + (max - min));
    }
}
