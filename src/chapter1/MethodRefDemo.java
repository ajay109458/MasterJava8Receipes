package chapter1;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodRefDemo {

	public static void main(String[] args) {
		// lamda expression
		Stream.of(1,2, 3, 4,5)
			.forEach(x -> System.out.println(x));
		
		Stream.of(1, 2, 3, 4, 5)
			.forEach(System.out::println);
		
		Consumer<Integer> printer = System.out::println;
		Stream.of(1, 2, 3, 4, 5)
			.forEach(printer);
		
	    Stream.generate(Math::random)
	    	.limit(10)
	    	.forEach(System.out::println);
	    
	    
	    List<String> strings = Arrays.asList("Cat", "Dog", "Elephant", "Fox");
	    strings.stream()
	    	.sorted((s1, s2) -> s1.compareTo(s2))
	    	.collect(Collectors.toList());
	    
	    System.out.println(strings);
	    
	    strings.stream()
	    	.sorted(String::compareTo)
	    	.collect(Collectors.toList());
	    
	    
	    strings.forEach(System.out::println);
	    
	    // compute the length of each string
	    strings.stream()
	    	.map(String::length)
	    	.forEach(System.out::println);
	    
	    strings.stream()
	    	.map(x -> x.length())
	    	.forEach(x -> System.out.println(x));
	}
}