import java.util.Locale;
import java.util.Scanner;
public class ExSeq02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, pi = 3.14159;
		System.out.println("Qual o raio da circunferência: ");
		raio = sc.nextDouble();
		sc.close();
		double area = pi * (Math.pow(raio, 2));
		System.out.printf("A área do circulo é: %.4f", area);
	}

}
