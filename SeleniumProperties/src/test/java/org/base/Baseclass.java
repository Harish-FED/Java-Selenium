package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;

	public static WebDriver browserSetup(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void launch(String url) {
		driver.get(url);
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static WebElement getLocator(String loctype, String value) {
		
		WebElement element = null;
		switch (loctype) {
		case "id":
			element = driver.findElement(By.id(value));
			break;
		
		case "name":
			element = driver.findElement(By.name(value));
			break;
			
		case "classname":
			element = driver.findElement(By.className(value));
			break;
			
		case "linktext":
			element = driver.findElement(By.linkText(value));
			break;
			
		case "partiallinktext":	
			element = driver.findElement(By.partialLinkText(value));
			break;
			
		case "xpath":
			element = driver.findElement(By.xpath(value));
			break;
			
		case "css":
			element = driver.findElement(By.cssSelector(value));
		default:
			System.out.println("Element Not Found");
			break;
		}
		
		return element;
	}
	
	public static void inputText(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void clickOn(WebElement element) {
		element.click();
	}
	
	//Actions
	
	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	
}
