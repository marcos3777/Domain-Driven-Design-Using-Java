package Exercicios3;
import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {

        //ver se numero natural n é um palindromo

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + numero % 10;
            numero = numero / 10;
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println("O numero " + numeroOriginal + " é um palindromo");
        } else {
            System.out.println("O numero " + numeroOriginal + " não é um palindromo");
        }

        scanner.close();



    }

}
