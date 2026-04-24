package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Введіть пароль ");

        String Password = sc.nextLine();
        boolean Digit = false;
        boolean UpperCase = false;
        boolean PasswordLength = false;

        for (char ch : Password.toCharArray()) {
            if (Character.isDigit(ch)) {
                Digit = true;
            }
            if (Character.isUpperCase(ch)) {
                UpperCase = true;
            }
            if (Password.length() >= 8) {
                PasswordLength = true;
            }
        }
        if (Digit && UpperCase && PasswordLength) {
            System.out.println(" Password is strong");
        } else {
            System.out.println(" Password is weak");
        }
    }
}