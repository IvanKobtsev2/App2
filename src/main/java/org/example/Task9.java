package org.example;

public class Task9 {
    public static void main(String[] args) {

        int a = 1;
        System.out.print("While: ");
        while (a<=5){
            System.out.print(a + "\t");
            a++;
        }
        int b = 1;
        System.out.println(" ");
        System.out.print("Do-while: ");
        do {
            System.out.print("\t" + b );
            b++;
        } while (b <= 5);
    }
}
