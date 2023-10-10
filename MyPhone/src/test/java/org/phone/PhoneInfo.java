package org.phone;

public class PhoneInfo {

	public void phoneName() {
		System.out.println("Phone: Apple iphone12");
	}
	
	public void phoneImeiNum() {
		System.out.println("IMEI: 29872639287365");
	}
	
	public void camera() {
		System.out.println("Camera: 12MP Front & Rear");
	}
	
	public void storage() {
		System.out.println("Storage: 128GB");
	}
	
	public void osName() {
		System.out.println("OS: iOS - 16.1");
	}
	
	public static void main(String[] args) {
		PhoneInfo pi = new PhoneInfo();
		pi.phoneName();
		pi.phoneImeiNum();
		pi.camera();
		pi.storage();
		pi.osName();
	}
}
