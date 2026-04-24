package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        double Grade = 0;
        char Result;

        System.out.println(" Ведіть оцінку " );
        Grade =  sc.nextDouble();
        if (Grade >=90 && Grade <=100){
            Result = 'A';
        } else if (Grade >=75 && Grade <=89) {
            Result = 'B';
        } else if (Grade >=60 && Grade <=74) {
            Result = 'C';
        } else if (Grade <60) {
            Result = 'F';
        } else {
            System.out.println(" Try again next time.");
            Result = '-';
        }

        System.out.println("Grade:" + Grade );
        System.out.println("Result:" + Result );

    }
}
