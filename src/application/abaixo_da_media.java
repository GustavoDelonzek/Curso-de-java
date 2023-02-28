package application;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] numero = new double[n];
		
		double soma = 0, media;
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numero[i] = sc.nextDouble();
			soma += numero[i];
		}
		
		media = soma/n;
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA");
		for(int i = 0; i<n; i++) {
			if(numero[i] < media) {
				System.out.println(numero[i]);
			}
		}
		sc.close();

	}

}
