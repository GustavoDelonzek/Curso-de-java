package entities;

public class Rectangle {
	public double Widht;
	public double Height;
	
	public double Area() {
		return Widht * Height;
	}
	public double Perimeter() {
		return 2*(Widht + Height);
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(Widht, 2) + Math.pow(Height, 2)); 
	}
	public String toString() {
		return "AREA = " + Area() + "\nPERIMETER = " + Perimeter() + "\nDIAGONAL = " + Diagonal();
	}
}
