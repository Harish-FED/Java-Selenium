package org.patterns;

public class NumberPattern {

	public static void numberPattern() {
		
		int i,j,row = 6;
		
		for(i = 1; i<=row; i++) {
			
			for(j = 1; j<=i; j++) {
				
				System.out.print(j);
				
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		numberPattern();
	}
}
