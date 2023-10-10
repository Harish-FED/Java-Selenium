package org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypes {

	public static void hashSet() {
		Set<String> hashset = new HashSet<>();
		hashset.add("Harish");
		hashset.add("Shravan");
		hashset.add("Subhashini");
		hashset.add("Harish");
		hashset.add("Sasikala");
		hashset.add("Santhanam");

		System.out.println("Hashset");
		for (String str : hashset) {
			System.out.println(str);
		}
		System.out.println();
	}

	public static void linkedhashset() {
		Set<Object> linkedhash = new LinkedHashSet<>();
		linkedhash.add("Harish");
		linkedhash.add("Shravan");
		linkedhash.add("Subhashini");
		linkedhash.add("Harish");
		linkedhash.add("Sasikala");
		linkedhash.add("Santhanam");

		System.out.println("LinkedHashSet");
		for (Object str : linkedhash) {
			System.out.println(str);
		}
		System.out.println();
	}
	
	public static void treeSet() {
		Set<String> tree = new TreeSet<>();
		tree.add("Harish");
		tree.add("Shravan");
		tree.add("Subhashini");
		tree.add("Harish");
		tree.add("Sasikala");
		tree.add("Santhanam");

		System.out.println("TreeSet");
		for (String str : tree) {
			System.out.println(str);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		hashSet();
		linkedhashset();
		treeSet();
	}
}
