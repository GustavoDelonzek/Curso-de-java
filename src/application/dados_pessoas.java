package application;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		double menor = 0, maior = 0, somaF = 0,mediaF = 0;
		int quantM = 0, quantF = 0;
		for(int i = 0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+ 1);
			altura[i] = sc.nextDouble();
			if(i == 0) {
				maior = altura[i];
				menor = altura[i];
			} else if(altura[i] > maior) {
				maior = altura[i];
			} else if(altura[i] < menor){
				menor = altura[i];
			}
			System.out.printf("Genero da %da pessoa: ", i + 1);
			sc.nextLine();
			genero[i] = sc.next().charAt(0);
			if(genero[i] == 'F') {
				somaF += altura[i];
				quantF++;
			} else {
				quantM++;
			}
		}
		mediaF = somaF/ quantF;
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaF);
		System.out.println("Numero de homens = " + quantM);
	}
}
