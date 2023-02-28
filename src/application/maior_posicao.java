package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double maior = 0;
		int pos = 0;
		double[] vetor = new double[n];
		for (int i = 0; i<n ;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			if(vetor[i]>maior) {
				maior = vetor[i];
				pos = i;
			}
		}
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = "+ pos);
	}

}
