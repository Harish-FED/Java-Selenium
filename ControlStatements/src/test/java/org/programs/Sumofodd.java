package org.programs;

public class Sumofodd {

	public static void sumOfOdd() {
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("The sum of odd number 1 to 100 is " + sum);
	}
	
	public static void main(String[] args) {
		sumOfOdd();
	}
}
