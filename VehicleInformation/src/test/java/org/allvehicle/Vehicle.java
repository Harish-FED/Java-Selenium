package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {

	public void vehicleNecessery() {
		System.out.println("List of Vehicles");
	}
	
	public static void main(String[] args) {
		Vehicle vh = new Vehicle();
		TwoWheeler two = new TwoWheeler();
		ThreeWheeler three = new ThreeWheeler();
		FourWheeler four = new FourWheeler();
		
		vh.vehicleNecessery();
		//Two
		two.cycle();
		two.bike();
		//Three
		three.auto();
		//Four
		four.car();
		four.bus();
		four.lorry();
	}
}
