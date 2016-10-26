package project;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Args: ");
		if (args.length > 0) {
			System.out.println(String.join(", ", args));
		} else {
			System.out.println("<none>");
		}
		
		System.out.println("\nHello world!");
	}
}
