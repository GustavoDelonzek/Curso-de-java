package entities;

public class Student {
	public String Name;
	public double a;
	public double b;
	public double c;
	
	public double FinalGrade() {
		return a + b + c;
	}
	
	public String toString() {
		if(FinalGrade() < 60) {
			return "Final Grade: " + FinalGrade() + "\nFAILED\nMISSING " + (60 - FinalGrade() + " POINTS.");
		} else {
			return "Final Grade: " + FinalGrade() + "\nPASS";
		}
		
	}
}
