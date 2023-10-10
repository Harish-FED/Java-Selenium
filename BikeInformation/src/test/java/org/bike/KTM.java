package org.bike;

public class KTM implements Bike {
	
	@Override
	public void cost() {
		System.out.println("Cost: 2,50,000");
	}
	
	@Override
	public void speed() {
		System.out.println("Speed: 200kmph");
	}
	
	public static void main(String[] args) {
		KTM k = new KTM();
		k.cost();
		k.speed();
	}

}
