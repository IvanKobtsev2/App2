package org.example;

public class task2 {
    public static void main(String[] args) {

        System.out.println("Вивід чисел з циклом for та прописом switch ");
        for (int i = 1; i <=10; i++) {
            System.out.println("\t" + i);

            switch (i) {
                case 1: System.out.println("\tодин"); break;
                case 2: System.out.println("\tдва");break;
                case 3: System.out.println("\tтри");break;
                case 4: System.out.println("\tчотири");break;
                case 5: System.out.println("\tп'ять");break;
                case 6: System.out.println("\tшість");break;
                case 7: System.out.println("\tсім");break;
                case 8: System.out.println("\tвісім");break;
                case 9: System.out.println("\tдев'ять");break;
                case 10: System.out.println("\tдесять");break;

                default: System.out.println("невідомо");
            }
        }
        System.out.println("");
        System.out.println("Пропускає непарні");
        for (int i = 1; i <=10; i++) {
            if (i % 2 != 0)
            {
                continue;
            }
            System.out.println("\t" + i);
        }
        System.out.println("");
        System.out.println("Трикутник");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}