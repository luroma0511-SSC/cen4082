package com.seminolestate.luroma.code;

public class Fibonacci {
	public static void main(String[] args){
		int term = 10;
		int result = fibonacci(term);
		System.out.println("The " + term + "th term of the Fibonacci sequence is " + result + ".");
		System.out.println("Execution complete!");
	}

	/** 
	 * Calculates the Fibonacci number at the specified position	
	 * using a recursive algorithm.
	 * The Fibonacci sequence begins with:
	 * 0, 1, 1, 2, 3, 5, 8, ...
	 * 
	 * @param number the position in the Fibonacci sequence to calculate.
	 * @return the Fibonacci number at the given position.
	 */
	public static int fibonacci(int number){
		if (number <= 1){
			return number;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
			
	}
}