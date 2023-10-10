package org.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {

	public static void hashMap() {

		Map<String, Integer> hashmap = new HashMap<>();

		hashmap.put("Harish", 28);
		hashmap.put("Subhashini", 27);
		hashmap.put("Shravan", 6);
		hashmap.put("Usha", 52);
		hashmap.put("Sasikala", 50);

		System.out.println("Hashset");

		for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();
	}

	public static void linkedhashMap() {

		Map<String, Integer> linkedhashmap = new LinkedHashMap<>();

		linkedhashmap.put("Harish", 28);
		linkedhashmap.put("Subhashini", 27);
		linkedhashmap.put("Shravan", 6);
		linkedhashmap.put("Usha", 52);
		linkedhashmap.put("Sasikala", 50);

		System.out.println("LinkedHashMap");

		for (Map.Entry<String, Integer> entry : linkedhashmap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();
	}

	public static void treeMap() {

		Map<String, Integer> tree = new TreeMap<>();

		tree.put("Harish", 28);
		tree.put("Subhashini", 27);
		tree.put("Shravan", 6);
		tree.put("Usha", 52);
		tree.put("Sasikala", 50);

		System.out.println("TreeMap");

		for (Map.Entry<String, Integer> entry : tree.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		hashMap();
		linkedhashMap();
		treeMap();
	}
}
