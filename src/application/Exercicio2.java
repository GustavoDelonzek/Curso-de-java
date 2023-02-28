package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Potencia;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b;
		Potencia potencia = new Potencia();
		System.out.println("Digite um número: ");
		a = sc.nextInt();
		System.out.println("Digite o número para elevar o primeiro:");
		b = sc.nextInt();

		System.out.printf("A potência de %d elevado a %d é: %d", a, b, potencia.funcao(a,b));
	}

}
