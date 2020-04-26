package chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entity.Person;

public class SortDemo {

	public static void main(String[] args) {
		
		List<String> sampleStrings = Arrays.asList("Cat", "Dog", "Elephant", "Any");
	
		sampleStrings = lengthThenAlphaSort(sampleStrings);
		
		sampleStrings.forEach(System.out::println);
	}
	
	public static List<String> defaultSort(List<String> sampleStrings) {
		Collections.sort(sampleStrings);
		return sampleStrings;
	}
	
	public static List<String> defaultSortUsingStreams(List<String> sampleStrings) {
		return sampleStrings.stream()
		.sorted()
		.collect(Collectors.toList());
	}
	
	public static List<String> lengthSortStrings(List<String> sampleStrings) {
		return sampleStrings.stream()
		.sorted((s1, s2) -> {
			return s1.length() - s2.length();
		})
		.collect(Collectors.toList());
	}
	
	public static List<String> lengthThenAlphaSort(List<String> sampleStrings) {
		return sampleStrings.stream()
				.sorted(Comparator.comparing(String::length)
						.thenComparing(Comparator.naturalOrder()))
				.collect(Collectors.toList());
	}
	
	public static List<Person> sortByNameAndAge(List<Person> people) {
		return people.stream()
				.sorted(Comparator.comparing(Person::getName)
						.thenComparingInt(Person::getAge))
				.collect(Collectors.toList());
	}
	
}


