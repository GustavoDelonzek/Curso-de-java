package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Example3Vect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de produtos: ");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for(int i =0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
		}
		double sum = 0.0;
		for(int i = 0; i<n ; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/n;
		
		System.out.printf("AVERAGE PRICE: %.2f", avg);
	}
}
