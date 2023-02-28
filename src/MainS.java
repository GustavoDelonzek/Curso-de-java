import java.util.Scanner;
import java.util.Locale;
public class MainS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);
		sc.close();
	}

}
