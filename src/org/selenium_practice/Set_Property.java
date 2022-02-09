package org.selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Property {

	public static void main(String[] args) throws InterruptedException {
//		 java.lang.IllegalStateException = when we give capital letter in setproperty
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-release.storage.googleapis.com/index.html?path=3.141/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://chromedriver.chromium.org/downloads");
		Thread.sleep(1000);
		
		driver.navigate().back();		Thread.sleep(1000);
		
		driver.navigate().refresh();		Thread.sleep(1000);
		
		driver.navigate().forward();		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		

		String title = driver.getTitle();
		System.out.println("\ncurrent page title is :\n\n" + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("\ncurrent page Url is : \n\n" + currentUrl);
		driver.quit();

	}

}
