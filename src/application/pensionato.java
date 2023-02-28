package application;

import java.util.Locale;
import java.util.Scanner;

import entities.register;

public class pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		register[] register = new register[10];
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			register[room - 1] = new register(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i<10; i++) {
			if (register [i] != null) {
				System.out.println((i + 1) + ": " + register[i]);
			}
		}
	}

}
