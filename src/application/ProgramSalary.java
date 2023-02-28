package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramSalary {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee;
		employee = new Employee();
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		System.out.println("Employee: " + employee.toString());
		System.out.println("Which porcentage to increase salary?");
		double percentage;
		percentage = sc.nextDouble();
		employee.IncreasePorcentage(percentage);
		System.out.println("Updated data: " + employee.toString());
	}

}
