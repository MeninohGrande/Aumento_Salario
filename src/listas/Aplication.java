package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		List<Funcionario> funcionario = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos empregados?");

		int e = sc.nextInt();

		for (int i=0; i < e; i++) {
			System.out.println("Empregado #" + i);

			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double sal = sc.nextDouble();

			funcionario.add(new Funcionario (id, nome, sal));
		}

		for (Funcionario f : funcionario) {
			System.out.println(f);
		}

		System.out.println("Qual funcionario terá aumento? (ID)");
		int id = sc.nextInt();

		Integer res = null;
		for (int i = 0; i < funcionario.size(); i++) {
			if (id == funcionario.get(i).getId() ) {
				res = i;
			}	
		}

		if (res == null) {
			System.out.println("Funcionario não existe!");
		} 
		else {
			System.out.print("Valor do aumento %: ");
			double valor = sc.nextDouble();
			funcionario.get(res).aumento(valor);
		}



		for (Funcionario f : funcionario) {
			System.out.println(f);
		}

		sc.close();
	}

}
