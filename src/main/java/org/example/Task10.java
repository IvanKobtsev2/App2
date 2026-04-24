package org.example;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println(" Введіть 5 чисел ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int Sum = 0;
        for (int num : numbers) {
            Sum += num;
        }

        double Average = (double) Sum / numbers.length;
        int Сount = 0;
        for (int num : numbers) {
            if (num > Average) {
                Сount++;
            }
        }

        System.out.println("Sum: " + Sum );
        System.out.println("Average: " + Average );
        System.out.println("Numbers > average: " + Сount);
    }
}
