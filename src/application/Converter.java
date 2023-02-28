package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Converter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is that dollar price? ");
		CurrencyConverter.price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.dollars = sc.nextDouble();
		System.out.printf("Amount to be paind in reais: %.2f", CurrencyConverter.reais());
	}

}
