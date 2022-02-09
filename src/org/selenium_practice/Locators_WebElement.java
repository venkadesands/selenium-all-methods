package org.selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators_WebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 ChromeOptions ing = new ChromeOptions();
		 ing.addArguments("incognito");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		WebElement email = Driver.findElement(By.id("email"));
		email.sendKeys("boxerinpeace@gmail.com");
		WebElement password = Driver.findElement(By.name("pass"));
		password.sendKeys("AbC!132");
		WebElement login = Driver.findElement(By.name("login"));
		login.click();
		Driver.close();
		
		
		
		
		}

}
