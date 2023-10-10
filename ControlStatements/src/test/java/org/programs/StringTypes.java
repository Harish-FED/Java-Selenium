package org.programs;

public class StringTypes {

	public static void main(String[] args) {
		String str = "Hello World!";
		String hero = "";
		String str1 = "Hello World Welcome";
		
		
		int length = str.length();
		System.out.println("length " + length);
		
		char c = str.charAt(6);
		System.out.println("Char " + c);
		
		String sub = str.substring(1, 7);
		System.out.println("Substring " + sub);
		
		String lower = str.toLowerCase();
		String upper = str.toUpperCase();
		
		System.out.println("Lowercase and Uppercase - " + lower +  " " + upper);
		
		String space = "     Hel lo    ";
		String trimmed = space.trim();
		System.out.println("trimmed "+trimmed);
		
		String replaced = str.replace("o", "a");
		System.out.println("Character replaced - " + replaced);
		String newString = str.replace("Hello", "Hola");
		System.out.println("String replaced - " + newString);
		
		String concat = str.concat(" Welcome");
		System.out.println("Concat - " + concat);
		
		boolean empty = hero.isEmpty();
		System.out.println("isEmpty - " + empty);
		
		boolean starts = str.startsWith("Hello");
		boolean ends = str.endsWith("World");
		System.out.println("Starts with - " + starts + ", " + "Ends with - " + ends);
		
		int index = str.indexOf('o');
		System.out.println("indexOf(ch) - " + index);
		
		int lastIndex = str.lastIndexOf('o');
		System.out.println("lastIndexOf(ch) - " + lastIndex);
		
		int indexof = str1.indexOf("Welcome");
		System.out.println("indexOf(str) - " + indexof);
		
		String[] split = str1.split(",");
		for (String spl : split) {
			System.out.println("Split - " + spl);
		}
		
		boolean equals = str1.equals(str);
		System.out.println("equals - " + equals);
		
		boolean equalignorecase = str.equalsIgnoreCase("hello world!");
		System.out.println("equalignorecase - " + equalignorecase);
		
		boolean contains = str.contains("!");
		System.out.println("contains - " + contains);
		
		
	}
}
