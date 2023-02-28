import java.util.Scanner;
import java.util.Locale;
public class ExSeq03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int A, B, C, D;
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor para A: ");
		A = sc.nextInt();
		System.out.println("Valor para B: ");
		B = sc.nextInt();
		System.out.println("Valor para C: ");
		C = sc.nextInt();
		System.out.println("Valor para D: ");
		D = sc.nextInt();
		sc.close();
		System.out.printf("Diferença: %d", A*B - C*D);
	}

}
