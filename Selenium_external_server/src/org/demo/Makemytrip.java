package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Makemytrip extends Baseclass {

	public static void booking() throws Throwable {
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='notification-frame-~10cb43881']"));
		frameByWebElement(frame);
		WebElement close = driver.findElement(By.xpath("//a[@class='close']"));
		click(close);
		parentFrame();
		Thread.sleep(2000);
		WebElement modal = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		click(modal);
		WebElement from = driver.findElement(By.id("fromCity"));
		click(from);
		WebElement chennai = driver.findElement(By.xpath("//p[text()='Chennai, India']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", chennai); 
//		Thread.sleep(3000);
		click(chennai);
		WebElement to = driver.findElement(By.id("toCity"));
		click(to);
		WebElement dubai = driver.findElement(By.xpath("//p[text()='Dubai, United Arab Emirates']"));
		click(dubai);
	}
	public static void main(String[] args) throws Throwable {
		 browserSetup("chrome");
		 launch("https://www.makemytrip.com/");
		 maximize();
		 //Thread.sleep(3000);
		 booking();
	}

}
