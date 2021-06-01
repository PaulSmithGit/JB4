package by.epam.unit04.main;

import java.util.Random;

public class Task05 {
//сортировка вставками

    public static void main(String[] args) {

        int s;
        s=12;
        int[] mass = new int[s];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(1000);
        }
        System.out.print("Массив:\t\t\t");
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("[%3d] ", mass[i]);
        }

        int in, out, sel;
        for (out = 1; out < mass.length; out++) {
            sel = mass[out];
            in = out;
            while (in > 0 && mass[in - 1] > sel) {
                mass[in] = mass[in - 1];
                --in;
            }
            mass[in] = sel;
        }

        System.out.println("\n");
        System.out.print("Сортировка (по возрастанию): \t");
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("[%3d] ", mass[i]);
        }
    }
}
