package Exercicios3;

import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {

        // programa para print todos os numeros da sequencia de fibonacci ate o numero
        // informado pelo usuario

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println(a);
        System.out.println(b);

        while (c < numero) {
            c = a + b;
            if (c < numero) {
                System.out.println(c);
            }
            a = b;
            b = c;
        }

        scanner.close();
    }
}
