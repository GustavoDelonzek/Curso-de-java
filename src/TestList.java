import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class TestList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<String> list = new ArrayList<>();
		
		list.add("Te");
		list.add("Amo");
		list.add("Meu");
		list.add("Saturninho <3");
		list.add("Aloco");
		
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		System.out.println("Index of amo: " + list.indexOf("Amo"));
		System.out.println("----------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
