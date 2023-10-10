package org.programs;

public class Countofeven {
	
	public static void evenCount() {
		
		int count = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i % 2 == 0) {
				count ++;
			}
		}
		
		System.out.println("The Count of Even Number fro 1 to 100 is " + count);
	}
	
	public static void main(String[] args) {
		evenCount();
	}

}
