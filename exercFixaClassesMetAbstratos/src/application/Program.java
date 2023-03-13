package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Número de pessoas: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Pessoa #" + i + " dados:");
			System.out.print("Física ou jurídica (f/j)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double income = sc.nextDouble();
			if (type == 'f') {
				System.out.print("Gastos com saúde: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PessoaFisica(name, income, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, income, numberOfEmployees));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("Impostos pagos:");
		for (Pessoa tp : list) {
			double tax = tp.calcularImposto();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL IMPOSTOS: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}