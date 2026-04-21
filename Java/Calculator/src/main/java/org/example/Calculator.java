package org.example;

import java.io.IOException;

public class Calculator {
    public static void main(String[] args)
            throws IOException {
double first_chislo;
double second_chislo;
char diya;
double result = 2;

System.out.println("Введи перше число");
first_chislo = ( double ) System.in.read();

System.out.println("Яку дію зробити?");
diya = ( char) System.in.read();

System.out.println("Введи друге число");
second_chislo = ( double ) System.in.read();

        switch (diya) {
            case '+':
                result = first_chislo + second_chislo;
                break;
            case '-':
                result = first_chislo - second_chislo;
                break;
            case '*':
                result = first_chislo * second_chislo;
                break;
            case '/':
                result = first_chislo / second_chislo;
                break;
            default:
                System.out.println("Невідома операція");
        }

System.out.println("Результат" + result);


    }
}
