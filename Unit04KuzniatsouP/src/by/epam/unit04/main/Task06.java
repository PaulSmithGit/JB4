package by.epam.unit04.main;

import java.util.Random;

public class Task06 {

    public static void main(String[] args) {

        int m,n;
        n=10;
        m=15;
        int[][] mass = new int[n][m];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(10);
            }
        }

        int x = 0;
        System.out.println("Массив:\n");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.printf("[%1d] ", mass[i][j]);
                if (mass[i][j] == 7) {
                    x++;
                }
            }
            System.out.println();
        }
        System.out.println("\nЧисло {7} встречается в матрице " + x + " раза.");
    }
}
