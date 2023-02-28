package application;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] nota_um = new double[n];
		double[] nota_dois = new double[n];
		double[] mediaAluno = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota_um[i] = sc.nextDouble();
			nota_dois[i] = sc.nextDouble();
			mediaAluno[i] = (nota_um[i] + nota_dois[i])/ 2;
		}
		System.out.println("Alunos aprovados:");
		for(int i = 0 ; i<n; i++) {
			if(mediaAluno[i] >= 6.0) {
				System.out.println(nome[i]);
			}
		}

	}

}
