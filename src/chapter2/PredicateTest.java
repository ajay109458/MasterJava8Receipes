package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> animalNames = Arrays.asList("Cat", "Bat", "Dog", "Elephant", "Ox");
		
		// filter animals of length 3
		animalNames.stream()
			.filter(s -> (s.length() == 3))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		String animalsContainsA = animalNames
				.stream().filter(s -> s.contains("a"))
				.collect(Collectors.joining(", "));
		
		System.out.println(animalsContainsA);
	}
	
}
