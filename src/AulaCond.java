import java.util.Scanner;
import java.util.Locale;
public class AulaCond {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário ");
		x = sc.nextDouble();
		if (x <= 2000) {
			System.out.printf("ISENTO");
		} else if (x <= 3000){
			System.out.printf("Imposto de renda: %.2f", (x - 2000)*0.08);
		} else if (x <= 4500) {
			System.out.printf("Imposto de renda: %.2f", (x - 3000)*0.18 + 1000 * 0.08);
		} else {
			System.out.printf("Imposto de renda: %.2f", (x - 4500)*0.28 + 1000 * 0.08 + 1500 * 0.18);
		}
		sc.close();
	}

}
