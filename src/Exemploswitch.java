import java.util.Locale;
import java.util.Scanner;

public class Exemploswitch {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int dia;
		Scanner sc = new Scanner(System.in);
		dia = sc.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		}
	}

}
