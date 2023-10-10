package org.computer;

public class Computer implements Hardware, Software {
	public void desktopModel() {
		System.out.println("Desktop: HP");
	}

	@Override
	public void softwareResources() {
		System.out.println("MS Word, MS Excel");
	}

	@Override
	public void hardwareResources() {
		System.out.println("CPU Computer");
	}
	
	public static void main(String[] args) {
		Computer c = new Computer();
		c.desktopModel();
		c.softwareResources();
		c.hardwareResources();
	}
}
