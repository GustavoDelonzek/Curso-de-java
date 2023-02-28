package application;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double alturaMedia = 0, idadeMenor = 0;
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] Idade = new int[n];
		double[] altura = new double[n];
		for(int i =0; i< n; i++) {
			System.out.printf("\nDados da %da pessoa:", i + 1);
			System.out.print("\nNome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			Idade[i] = sc.nextInt();
			if(Idade[i] < 16) {
				idadeMenor++;
			}
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			alturaMedia += altura[i];
		}
		System.out.printf("Altura média: %.2f\n", alturaMedia/n);
		System.out.println("Pessoas com menos de 16 anos: " + (idadeMenor/n * 100) + "%");
		for (int i = 0; i <n; i++) {
			if(Idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
