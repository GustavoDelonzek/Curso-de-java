package entities;
public class CurrencyConverter {
	public static double price;
	public static double dollars;
	public static double reais() {
		return (price + (price * 6/100)) * dollars;
	}
}
