package org.programs;

public class Fibonacci {

	public static void fibonacciSeries() {
		
		int num = 100, 
			firstTerm = 0, 
			secondTerm = 1;
		
		System.out.println("Fibonacci Series till " + num + " terms: ");
		
		for(int i = 1; i<=num; i++) {
			System.out.print(firstTerm + ",");
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
	
	public static void main(String[] args) {
		fibonacciSeries();
	}
}
