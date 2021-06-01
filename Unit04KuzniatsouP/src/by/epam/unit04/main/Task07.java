package by.epam.unit04.main;

import java.util.Random;

public class Task07 {

    public static void main(String[] args) {

        int n;
        n=7;
        int[][] mass = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(1000);
            }
        }

        System.out.println("Массив:\n");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.printf("[%3d] ", mass[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("Числа по диагонали: [0,0]>>[n,n]: ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    System.out.println(mass[i][j]);
                }
            }
        }
    }
}
