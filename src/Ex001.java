import java.util.Locale;
public class Ex001 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30, code = 5290;
		char gender = 'F';
		double price1 = 2100.0, price2 = 650.50, measure = 53.234567;
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f\nRouded (Three decimal places): %.3f\n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point: %.3f", measure);
	}

}
