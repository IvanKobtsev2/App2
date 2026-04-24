package org.example;


public class Task1 {
    public static void main(String[] args) {
        int[] array = {10, 25, -31, -95, -48, 87, 63, 100, 2, 333};
        int Min, Max, Sum = 0, Even_count = 0, Odd_count = 0;
        double Average;

        Min = Max = array[0];

        for (int i = 1; i < 10; i++) {
            if (array[i] < Min) Min = array[i];
            if (array[i] > Max) Max = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            Sum += array[i];
        }

        Average = (double) Sum / array.length;

        for (int num : array) {
            if (num % 2 == 0) {
                Even_count++;
            } else {
                Odd_count++;
            }
        }



        System.out.println("Min: " + Min);
        System.out.println("Max: " + Max);
        System.out.println("Average: " + Average);
        System.out.println("Even count: " + Even_count);
        System.out.println("Odd count: " + Odd_count);

        if (Average>50){
            System.out.println("High average");
        }
        else {
            System.out.println("Low average");
        }
    }
}