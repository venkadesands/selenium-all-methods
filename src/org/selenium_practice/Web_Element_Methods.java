package org.selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_Element_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions ing = new ChromeOptions();
		ing.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ing);
		
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("venkadesands1992@gmail.com");
//		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("aTOz@@113");
//		Thread.sleep(1000);
		boolean dis1 = password.isDisplayed();
		System.out.println("password is displayed  : "+dis1);
		boolean enabled = password.isEnabled();
		System.out.println("password is enabled  : "+enabled);
		boolean selected = password.isSelected();
		System.out.println("password is selected  : "+selected);
//		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
//		Thread.sleep(1000);
//		driver.close();
	}

}

