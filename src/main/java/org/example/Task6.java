package org.example;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {-31, -95, 250, -48, 87, 109, 63, 100, 2, 333};

        for (int i = 0; i < 10; i++) {
            if (array[i] < 0) {
                continue;
            }
            if (array[i] > 100) {
                System.out.println("First number > 100: " + array[i]);
                break;
            }
        }
    }
}

