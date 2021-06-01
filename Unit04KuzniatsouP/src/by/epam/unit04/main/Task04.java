package by.epam.unit04.main;

import java.util.Random;

public class Task04 {
//Сортировка перебором

    public static void main(String[] args) {

        int s;
        s=10;
        int[] mass = new int[s];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(1000);
        }
        System.out.print("Массив:\t\t\t\t");
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("[%3d] ", mass[i]);
        }

        int max, sel;
        for (int i = 0; i < mass.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] > mass[max]) {
                    max = j;
                }
            }

            sel = mass[i];
            mass[i] = mass[max];
            mass[max] = sel;
        }

        System.out.print("\n");
        System.out.print("Сортировка (по убыванию): \t");
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("[%3d] ", mass[i]);
        }
    }
}
