package org.selenium_practice;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Minimize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions ing = new ChromeOptions();
		ing.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ing);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		setsize
//		dimension import need to select selenium import
		Dimension size = new Dimension(250, 350);
		driver.manage().window().setSize(size);
		Thread.sleep(2000);
// setposition
//		point import need to select selenium import
		Point position = new Point(300, 400);
		driver.manage().window().setPosition(position);
		Thread.sleep(2000);
		driver.close();
		
	}

}
