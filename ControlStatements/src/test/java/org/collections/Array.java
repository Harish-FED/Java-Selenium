package org.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array {

	public static void simpleArray() {

		int[] newArray = { 10, 20, 30, 40, 50 };
		System.out.println("newArray - " + newArray[1]);

		int[] newArray1 = new int[5];

		newArray1[0] = 100;
		newArray1[1] = 200;
		newArray1[2] = 300;
		newArray1[3] = 400;
		newArray1[4] = 500;
		// newArray1[5] = 600;

		System.out.println("newArray1 - " + newArray1[4]);
	}

	public static void arrayList() {

		ArrayList<Object> arr = new ArrayList<>();

		// to add
		arr.add("Harish");
		arr.add("Shravan");
		arr.add("Subha");
		arr.add(27);

		// to update
		arr.set(2, "Subhashini");

		// size before removing
		int size1 = arr.size();
		System.out.println("size before removing - " + size1);
		
		// to remove
		arr.remove(0);

		// size after removing
		int size2 = arr.size();
		System.out.println("size after removing - " + size2);
		
		// to get a single array
		System.out.println("to get a single array - " + arr.get(1));

		// to get whole array
		System.out.print("to get whole array - ");
		for (Object str : arr) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		//to find indexof
		int indexOf = arr.indexOf("Shravan");
		System.out.println("indexOf - " + indexOf);
	}
	
	public static void linkedList() {
		LinkedList<Object> li = new LinkedList<>();
		
		li.add(3);
		li.add("Hello");
		li.add(1);
		li.add("Acer");
		
		for(Object obj : li) {
			System.out.println(obj + " ");
		}
	}

	public static void main(String[] args) {
		simpleArray();
		arrayList();
		linkedList();
	}
}
