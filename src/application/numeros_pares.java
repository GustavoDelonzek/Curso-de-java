package application;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] num = new int[n];
		int par = 0;
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
			if(num[i] % 2 == 0) {
				par++;
			}
		}
		System.out.println("NUMEROS PARES:");
		for(int i =0; i<n; i ++) {
			if(num [i] % 2 == 0) {
				System.out.printf("%d ", num[i]);
			}
		}
		System.out.println("\nQuantidade de pares: " + par);
	}

}
