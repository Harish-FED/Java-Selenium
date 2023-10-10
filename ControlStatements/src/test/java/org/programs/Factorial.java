package org.programs;

import java.util.Scanner;

public class Factorial {
	
	public static void factorialOfNum() {
		
		Scanner fact = new Scanner(System.in);
		
		System.out.print("Enter The Number :");
		
		int num = fact.nextInt();
		long factorial = 1;
		
		for(int i = 1; i<=num; ++i) {
			factorial *= i;
		}
		
		System.out.printf("Factorial of %d = %d", num, factorial);
		
		fact.close();
	}
	
	public static void main(String[] args) {
		factorialOfNum();
	}
}
