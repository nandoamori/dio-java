package Exercises.ExLoops;

//faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e ímpares.
import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros, numero;
        int pares = 0, impares = 0;
        
        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();
        
        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) pares++;
            else impares++;

            contador++;

            System.out.println("Quantidade de pares: " + pares);
            System.out.println("Quantidade de ímpares: " + impares);

        } while (contador < qtdNumeros);

    }
}
