package org.network;

public class Wifi {
	
	public void wifiName() {
		System.out.println("Types of Network");
	}
	
	public static void main(String[] args) {
		Wifi wi = new Wifi();
		MobileData md = new MobileData();
		Lan ln = new Lan();
		Wireless wl = new Wireless();
		
		wi.wifiName();
		md.dataName();
		ln.lanName();
		wl.modemName();
				
	}
}
