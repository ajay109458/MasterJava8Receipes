package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class SupplierDemo {
	
	public static void main(String[] args) {
		
		defineSupplier();
		
		findNameFromCollection();
		
	}

	private static void defineSupplier() {
		//Using anonymous class
		DoubleSupplier doubleSupplier = new DoubleSupplier() {
			
			@Override
			public double getAsDouble() {
				// TODO Auto-generated method stub
				return Math.random();
			}
		};
		
		// using lambda expression
		doubleSupplier = () -> Math.random();
		
		// using function reference
		doubleSupplier = Math::random;
		
		Stream.generate(Math::random)
    	.limit(10)
    	.forEach(System.out::println);
	}
	
	public static void findNameFromCollection() {
		List<String> names = Arrays.asList("Mal", "Wash", "Kaylee", "Inara",
				 "Zoë", "Jayne", "Simon", "River", "Shepherd Book");
		
		Optional<String> first = names.stream()
			.filter(e -> e.startsWith("C"))
			.findFirst();
		
		
		if (first.isPresent()) {
			System.out.println(first.get());
		}
		
		System.out.println(first.orElse("None"));
	}

}
