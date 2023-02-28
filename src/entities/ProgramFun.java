package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFun {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee_> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for(int i = 0; i <N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i +1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee_ emp = new Employee_(id, name, salary);
			
			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("Id invalided");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee_ emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}
	
	public static Integer position (List<Employee_> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			} 
		}
		return null;
	}

}
