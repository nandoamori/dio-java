package Exercises.ExLoops;
import java.util.Scanner;

/*
 Faça um programa que peça uma nota entre zero e dez. 
 Mostre uma mensagem caso o valor seka inválido e continue pedindo até que o valor seja válido.
 */

 public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            
            System.out.println("Nota inválida, digite novamente: ");
            nota = scan.nextInt();
        }
    }
 }