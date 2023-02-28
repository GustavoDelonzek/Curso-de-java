import java.util.Scanner;
import java.util.Locale;
public class ExSeq06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A,B,C, area;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		area = (A * C) * 0.5;
		System.out.printf("TRIÂNGULO = %.4f", area);
		System.out.printf("\nCIRCULO = %.3f", Math.pow(C, 2) * 3.14159);
		System.out.printf("\nTRAPEZIO = %.4f", (A+B)*C/2);
		System.out.printf("\nQUADRADO = %.3f", B*B);
		System.out.printf("\nRETANGULO = %.3f", A*B);
	}

}
