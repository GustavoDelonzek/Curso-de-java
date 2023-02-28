package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ACCOUNTT;

public class Account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ACCOUNTT accountt;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			accountt = new ACCOUNTT(number, holder, initialDeposit);
		}
		else {
			accountt = new ACCOUNTT(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(accountt);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		accountt.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(accountt);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		accountt.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(accountt);
		sc.close();
	}

}
