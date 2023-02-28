package application;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter o vetor? ");
		int n = sc.nextInt();
		int quantPar = 0, somaPar = 0;
		double mediaPar;
		int[] num = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
			if (num[i] % 2 ==0) {
				quantPar++;
				somaPar += num[i];
			}
		}
		if(quantPar != 0) {
			mediaPar = somaPar/quantPar;
			System.out.printf("MEDIA DOS PARES = %.2f", mediaPar);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
	}

}
