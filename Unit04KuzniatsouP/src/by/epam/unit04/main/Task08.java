package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        int m, n;
        m = 7;
        n = 8;
        int[][] mass = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Массив:\n");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.printf("[%3d] ", mass[i][j]);
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int k, p;
        System.out.print("Введите номер строки (от 0 до " + (m - 1) + "): ");
        k = sc.nextInt();
        System.out.print("Введите номер столбца (от 0 до " + (n - 1) + "): ");
        p = sc.nextInt();

        System.out.println("\n");
        System.out.println(k + "-я строка, и " + p + "-й столбец:\n");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == k | j == p) {
                    System.out.printf("[%3d] ", mass[i][j]);
                } else {
                    System.out.printf("[ x ]");
                }
            }
            System.out.println();
        }
    }
}