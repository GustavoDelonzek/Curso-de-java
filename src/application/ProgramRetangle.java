package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRetangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle Rectangle;
		Rectangle = new Rectangle();
		System.out.println("Enter rectangle widht and height:");
		Rectangle.Widht = sc.nextDouble();
		Rectangle.Height = sc.nextDouble();
		System.out.print(Rectangle.toString());
		sc.close();		
	}

}
