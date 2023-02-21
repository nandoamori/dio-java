package Exercises.ExArrays;

import java.util.Scanner;

/*faça um programa que leia um vetor de 6 caracteres, diga quantas consoantes foram lidas
 e as imprima*/

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
            String[] consoantes = new String[6];
            int qtdeConsoantes = 0; 

            int count = 0;
            do {
                System.out.println("letra: ");
                String letra = scan.next();

                if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
                    consoantes[count] = letra;
                    qtdeConsoantes++;
                }
                
                count++;

            } while (count < consoantes.length);

            System.out.print("Consoantes: ");
            for (String string : consoantes) {
                if (string != null) {
                System.out.print(string + "");
                }
            }
            System.out.println("Quantidade de consoantes: " + qtdeConsoantes);
    }
}
