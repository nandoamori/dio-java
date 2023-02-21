package Exercises.ExLoops;

import java.util.Scanner;

//faça um programa que leia cinco números e informe o maior número e a média entre eles

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
      
        int contador = 0;
        
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            contador = contador + 1;
        } while(contador < 5);

        System.out.println("Número maior: " + maior);
        System.out.println("Média: " + (soma / 5));

    }
}
