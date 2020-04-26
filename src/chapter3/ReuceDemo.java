package chapter3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReuceDemo {

	public static void main(String[] args) {
		String[] array = "This is an array of strings".split(" ");
		long count = Arrays.stream(array)
				.map(String::length)
				.count();
		
		System.out.println("There are total " + count + " strings");
		
		int totalLength = Arrays.stream(array)
				.mapToInt(String::length)
				.sum();
		
		System.out.println("Total length of the string : " + totalLength);
		
		OptionalDouble avg = Arrays.stream(array)
				.mapToInt(String::length)
				.average();
		
		System.out.println("Average length of the string: " + avg);
		
		OptionalInt maxLen = Arrays.stream(array)
				.mapToInt(String::length)
				.max();
		
		System.out.println("Max length of the string : " + maxLen);
		
		OptionalInt minLength = Arrays.stream(array)
				.mapToInt(String::length)
				.min();
		
		System.out.println("Min length of the string : " + minLength);
		
		
		// reduce method example
		int sum = IntStream.rangeClosed(1, 10)
			.reduce((x, y) -> (x+y))
			.orElse(0);
		
		System.out.println("Sum of 1 to 10 is " + sum);
		
		sum = IntStream.rangeClosed(1, 10)
				.reduce(0, Integer::sum);
		
		System.out.println(sum);
		
	}
	
}
