package org.programs;

public class EvenNumber {
	
	public static void evenNum() {
		int num = 100;
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		evenNum();
	}
}
