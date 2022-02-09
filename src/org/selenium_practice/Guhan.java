package org.selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guhan {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/channel/UCBjp7qFQZdF6p7jE1ErRokw");
	WebElement guhanlogo = driver.findElement(By.id("img"));
	Thread.sleep(5000);
		guhanlogo.click();
		Thread.sleep(5000);
		WebElement searchbox = driver.findElement(By.id("search"));
		searchbox.sendKeys("google trick");
		
	}
	
	
	
}
