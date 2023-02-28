package application;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		int velha = 0, pos = 0;
		for(int i = 0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if (idade [i] > velha) {
				velha = idade[i];
				pos = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA = " + nome[pos]);
	}

}
