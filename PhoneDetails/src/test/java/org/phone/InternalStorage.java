package org.phone;

public class InternalStorage {
	
	public void processorName() {
		System.out.println("Processor Name: A15 Bionic Chip");
	}
	
	public void ramSize() {
		System.out.println("Ram Size: 4GB RAM");
	}
	
	public static void main(String[] args) {
		InternalStorage is = new InternalStorage();
		ExternalStorage es = new ExternalStorage();
		
		es.size();
		is.ramSize();
		is.processorName();
	}
	
}
