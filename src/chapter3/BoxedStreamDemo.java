package chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedStreamDemo {

	public static void main(String[] args) {
		List<String> strings =  Stream.of("Ajay", "Yadav", "is", "my", "name")
				.collect(Collectors.toList());
		
		strings.forEach(System.out::println);
		
		// primitive integer using boxed
		List<Integer> nums = IntStream.of(1, 2, 3, 4, 5, 6)
		.boxed().collect(Collectors.toList());
		
		nums.forEach(System.out::println);
		
		// primitive integer to object
		nums = IntStream.of(2, 4, 6, 8, 10)
			.mapToObj(Integer::valueOf)
			.collect(Collectors.toList());
		
		nums.forEach(System.out::println);
		
		// convert an int stream to a array
		System.out.println("Stream to an array: ");
		int[] array = IntStream.of(1, 2, 3, 4, 5, 6).toArray();
		
		Arrays.stream(array).forEach(System.out::println);
	}
	
}
