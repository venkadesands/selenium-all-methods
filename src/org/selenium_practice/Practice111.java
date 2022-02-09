package org.selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice111 {
 
 
	public static void main(String[] args) {
		String s = "venkadesands";
		String trim = s.trim();
		
		
		int length = s.length();
		System.out.println(length);
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.get("https://www.google.com/");
//		driver.navigate().to("https://www.facebook.com/");
//		WebElement log_In = driver.findElement(By.name("login"));
//		
//		boolean enabled = log_In.isEnabled();
//		System.out.println("is enabled or not :"+ enabled);
//		boolean displayed = log_In.isDisplayed();
//		System.out.println("is Displayed or not :"+ displayed);
//		log_In.click();
//		boolean selected = log_In.isSelected();
//		System.out.println("is selected or not :"+ selected);
//		
	}

}
