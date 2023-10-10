package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators extends Baseclass {     
	
	 WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	 WebElement accessories = driver.findElement(By.xpath("//a[@aria-label='Mobiles & Accessories, You are currently on a drop-down. To open this drop-down, Press Enter.']"));
	 WebElement cases = driver.findElement(By.xpath("//a[text()='Cases & Covers']"));
	 WebElement basiccase = driver.findElement(By.xpath("//span[text()='Basic Cases']"));
	 WebElement selectedcase = driver.findElement(By.xpath("(//span[contains(text(),'Amozo Ultra Hybrid Camera and Drop Protection Back Cover Case for iPhone 13')])[3]"));
	 WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	 WebElement checkout = driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']"));
}
