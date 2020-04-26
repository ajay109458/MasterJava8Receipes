package chapter3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	
	
	public static void main(String[] args) {
		String names = Stream.of("Bike", "Car", "Jeep", "Truck")
				.collect(Collectors.joining(", "));
		
		System.out.println(names);
		
		String[] munsters = { "Herman", "Lily", "Eddie", "Marilyn", "Grandpa" };
		
		names = Arrays.stream(munsters)
			.collect(Collectors.joining(", "));
		System.out.println(names);
		
		List<BigDecimal> nums 
			= Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
				.limit(10).collect(Collectors.toList());
		System.out.println(nums);
		
		Stream.generate(Math::random)
			.limit(10)
			.forEach(System.out::println);
		
		// Use range methods
		List<Integer> ints = IntStream.range(10, 15)
				.boxed().collect(Collectors.toList());
		ints.forEach(System.out::println);
	}
}
