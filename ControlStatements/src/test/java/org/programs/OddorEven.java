package org.programs;

import java.util.Scanner;

public class OddorEven {
	
	public static void oddEvenChecker() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is a Even Number");
		} else {
			System.out.println(num + " is a Odd Number");
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		oddEvenChecker();
	}

}
