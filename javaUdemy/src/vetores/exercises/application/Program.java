package vetores.exercises.application;
import java.util.Locale;
import java.util.Scanner;

import vetores.exercises.entities.Person;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        int n, nminor;
        double percent;

        System.out.print("Quantas pessoas voce vai digitar? ");
	    n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Average: ");
            double average = sc.nextDouble();
            vect[i] = new Person(name, age, average);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect [i].getAverage();
        }

        double avg = sum / n;
        System.out.printf("Altura media = %.2f\n", avg);

        nminor = 0;

        for (int i = 0; i < vect.length; i++){
            if (vect [i].getAge() < 16) {
                nminor++;
            }
        }

        percent = ((double)nminor / n) * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent);

        for (int i = 0; i < n; i++) {
            if (vect[i].getAge() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }

		sc.close();
    }
}
