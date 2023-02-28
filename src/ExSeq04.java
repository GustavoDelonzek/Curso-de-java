import java.util.Scanner;
import java.util.Locale;
public class ExSeq04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num;
		double salar, horas;
		System.out.println("Número do funcionário: ");
		num = sc.nextInt();
		System.out.println("Número de horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.println("Sálario por hora: ");
		salar= sc.nextDouble();
		sc.close();
		System.out.printf("Number: %d\nSALARY: %.2f ", num, horas * salar);
	}

}
