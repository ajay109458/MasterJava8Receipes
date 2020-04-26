package chapter1;

public class RunnableDemo {

	public static void main(String[] args) {
		
		// Anonymous class
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside the runnable");
				
			}
		}).start();
		
		// Lamda expression
		new Thread(() ->  {
			System.out.println("Inside lamda expression");
		}).start();
		
		// Lamda expression assign to the variable
		Runnable r = () -> {System.out.println("I am with variable");};
		new Thread(r).start();
	}
	
}
