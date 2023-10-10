package org.constructors;

public class Constructors {
	
	private String name;
	private int age;
	
	public Constructors() {
		name = "unknown";
		age = 0;
	}

	public Constructors(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		Constructors obj1 = new Constructors();
		Constructors obj2 = new Constructors("Harish", 28);
		
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		
		//System.out.println(obj1);
		//System.out.println(obj2);
	}

}
