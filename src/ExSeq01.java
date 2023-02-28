import java.util.Scanner;
public class ExSeq01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Digite um número:");
		x = sc.nextInt();
		System.out.println("Outro:");
		y = sc.nextInt();
		sc.close();
		System.out.printf("Soma: %d", x+y);
	}
}
