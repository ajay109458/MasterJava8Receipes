package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionTest {
	public static void main(String[] args) {
		List<String> animalNames = Arrays.asList("Cat", "Bat", "Dog", "Elephant", "Ox");

		animalNames.stream()
			.map(s -> s.length())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
	}
}
