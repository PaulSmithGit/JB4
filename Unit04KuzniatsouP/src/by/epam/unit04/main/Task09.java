package by.epam.unit04.main;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Введите размерность матрицы: ");
            n = sc.nextInt();
            if (n % 2 == 0) {
                sc.close();
                break;
            } else {
                System.out.print("Размерность матрицы должна быть чётной \n");
            }
        }

        int[][] mass = new int[n][n];
            for (int i = 0; i < mass.length; i++) {
                mass[i][n - i - 1] = i + 1;
            }
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    System.out.printf("[%2d] ", mass[i][j]);
                }
                System.out.println();
            }
        }
    }
