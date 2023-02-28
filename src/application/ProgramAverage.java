package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramAverage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student;
		student = new Student();
		student.Name = sc.nextLine();
		student.a = sc.nextDouble();
		if (student.a > 30) {
			do {
				System.out.println("Try again, max is 30.");
				student.a = sc.nextDouble();
			}while(student.a> 30);
		}
		student.b = sc.nextDouble();
		if (student.b > 35) {
			do {
				System.out.println("Try again, max is 35.");
				student.b = sc.nextDouble();
			}while(student.b> 35);
		}
		student.c = sc.nextDouble();
		if (student.c > 35) {
			do {
				System.out.println("Try again, max is 35.");
				student.c = sc.nextDouble();
			}while(student.c> 35);
		}
		System.out.println(student.toString());
		
		
	}
}
