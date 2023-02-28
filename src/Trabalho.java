import java.util.Locale;
import java.util.Scanner;

import entities.funcionarios;

public class Trabalho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n; 
		System.out.print("Quantos funcionarios? ");
		n = sc.nextInt();
		funcionarios[] funcionario = new funcionarios[n];
		for(int i = 0; i< funcionario.length; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			funcionario[i] = new funcionarios(id, name, salary);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		System.out.print("Enter the porcentage: ");
		double porcentage = sc.nextDouble();
		for (int i = 0 ; i < funcionario.length; i++) {
			if (id == funcionario[i].getId()) {
				funcionario[i].setSalary(funcionario[i].getSalary() + (funcionario[i].getSalary() * porcentage/100));
			}
		}
		
		System.out.println("List of employees: ");
		for(int i = 0; i< funcionario.length; i++) {
			System.out.println(funcionario[i]);
		}
	}

}
