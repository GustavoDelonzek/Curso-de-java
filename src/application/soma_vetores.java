package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores em cada vetor? ");
		int n = sc.nextInt();
		int[] vetA = new int[n], vetB = new int [n];
		System.out.println("Digite os valores do vetor A: ");
		for(int i =0; i<n; i++) {
			vetA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for(int i =0; i<n; i++) {
			vetB[i] = sc.nextInt();
		}
		int[] vetC = new int[n];
		System.out.println("VETOR RESULTANTE: ");
		for(int i =0; i<n; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.println(vetC[i]);
		}
	}

}
