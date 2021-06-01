package by.epam.unit04.main;

import java.util.Random;

public class Task01 {

    public static void main(String[] args) {

        int[] mass = new int[8];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(1000);
        }
        System.out.print("Массив: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("[%3d] ", mass[i]);
        }

        System.out.println("\n");
        int chet = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                chet++;
            }
        }
        int[] target = new int[chet];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if (mass[i] %2 == 0) {
                target[j++] = mass[i];
            }
        }
        System.out.print("Четные числа из массива: ");
        for (int i = 0; i < target.length; i++) {
            System.out.printf("[%3d] ", target[i]);
        }
    }
}
