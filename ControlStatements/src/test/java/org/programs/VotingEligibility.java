package org.programs;

import java.util.Scanner;

public class VotingEligibility {

	public static void checkEligiblity() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 120) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
	}
	
	public static void main(String[] args) {
		checkEligiblity();
	}
}
