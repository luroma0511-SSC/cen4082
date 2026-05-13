package code;

public class Fibonacci {
	public static void main(String[] args){
		int term = 10;
		int result = fibonacci(term);
		System.out.println("The " + term + "th term of the Fibonacci sequence is " + result + "."); 
	}

	private static int fibonacci(int number){
		if (number <= 1){
			return number;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
			
	}
}