package org.base;

public class Websitelaunch extends Baseclass {

	public static void main(String[] args) {
		browserSetup("chrome");
		maximize();
		launch("https://threads.net/");
	//	quit();
	}
}
