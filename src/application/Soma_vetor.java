package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		System.out.print("VALORES: ");
		for(int i = 0; i < n; i++) {
			System.out.printf("%.2f ", vetor[i]);
		}
		System.out.printf("\nSoma: %.2f\n", soma);
		System.out.printf("MEDIA: %.2f", soma/n);
		
	}

}
