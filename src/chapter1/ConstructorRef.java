package chapter1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import entity.Person;

public class ConstructorRef {

	private static List<Person> people;
	
	static {
		people = new ArrayList<Person>();
		people.add(new Person("Ajay", 28));
		people.add(new Person("Priya", 24));
	}
	
	public static void main(String[] args) {
		List<String> names = people.stream()
			.map(e -> e.getName())
			.collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		people.stream()
			.map(Person::getName)
			.collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
		List<String> namesList = Arrays.asList("Ajay", "Priya", "Usha");
		people = namesList.stream()
				.map(e -> new Person(e, 10))
				.collect(Collectors.toList());
		
		people.forEach(System.out::println);
	}
	
}
