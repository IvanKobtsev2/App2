package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
        throws IOException {
        Scanner sc = new Scanner(System.in);

            double first_value;
            double second_value;
            char action;
            double result =0;

            System.out.println("Введи перше число");
            first_value = sc.nextDouble();

            System.out.println("Яку дію зробити?");
            action = ( char) System.in.read();

            System.out.println("Введи друге число");
            second_value = sc.nextDouble();

            switch (action) {
                case '+':
                    result = first_value + second_value;
                    break;
                case '-':
                    result = first_value - second_value;
                    break;
                case '*':
                    result = first_value * second_value;
                    break;
                case '/':
                    if (second_value == 0 ) {
                        System.out.println("Ділення на 0 неможливе");
                    }
                    result = first_value / second_value;
                    break;
                default:
                    System.out.println("Невідома операція");
            }

            System.out.println("Результат: " + result);


        }
    }
