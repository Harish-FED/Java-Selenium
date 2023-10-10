package org.selenium;

import org.base.Baseclass;
import org.openqa.selenium.JavascriptExecutor;

public class Robot extends Baseclass  {
	
	public static void main(String[] args) throws InterruptedException {

		browserSetup("chrome");
		maximize();
		launch("https://www.ajio.com/");
	//	Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		mouseHover(getLocator("xpath", "//a[@title = 'KIDS']"));
		Thread.sleep(1000);
		clickOn(getLocator("xpath", "//a[contains(text(),'T-Shirts Under 399')]"));
		Thread.sleep(5000);
		clickOn(getLocator("xpath", "//label[@for = 'Junior Boys']"));
		Thread.sleep(3000);
		clickOn(getLocator("xpath","//div[contains(text(),'Star Wars Print Crew-Neck T-shirt')]" ));
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click()", getLocator("xpath", "(//button[contains(text(),'Next')])[2]"));
		//clickOn(getLocator("xpath", "(//div[@class='slick-list']/preceding::button[@data-role='none'])[4]"));
		//clickOn(getLocator("xpath", "(//button[contains(text(),'Next')])[2]"));
	}

}
