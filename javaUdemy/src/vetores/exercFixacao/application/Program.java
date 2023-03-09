package vetores.exercFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import vetores.exercFixacao.entities.Rent;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        Rent[] vect = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }

        }
        sc.close();
    }
}
