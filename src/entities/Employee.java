package entities;

public class Employee {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreasePorcentage(double porcentage) {
		GrossSalary += (GrossSalary * (porcentage/100));
	}
	
	public String toString() {
		return Name + ", $" + NetSalary();
	}
}
