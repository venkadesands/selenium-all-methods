package org.selenium_practice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize1 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.co.in");
	driver.manage().window().maximize();
//	window size for minimize
	Dimension size = new Dimension(100,500);
	driver.manage().window().setSize(size);
	Thread.sleep(3000);
//	 window point for minimize 
	Point position = new Point(400,550);
	driver.manage().window().setPosition(position);
	System.out.println(driver.getTitle());
	
	
	Thread.sleep(3000);
	driver.quit();
	
	
}


 
 
	}

