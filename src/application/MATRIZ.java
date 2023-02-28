package application;

import java.util.Locale;
import java.util.Scanner;

public class MATRIZ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		int neg = 0;
		System.out.println("Diagonal principal");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i == j) {
					System.out.println(matriz[i][j]);
				}
				if(matriz[i][j] < 0) {
					neg++;
				}
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVOS: " + neg);
		
		sc.close();
	}

}
