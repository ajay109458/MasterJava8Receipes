package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Car", "Jeep", "Plane");
		
		// Anonymous class implementation
		strings.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// lambda expression implementation
		strings.forEach(s -> System.out.println(s));
		
		// Method reference
		strings.forEach(System.out::println);
	}
	
}
