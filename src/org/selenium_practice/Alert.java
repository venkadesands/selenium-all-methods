package org.selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\Chrome\\chromedriver.exe");
		ChromeOptions ing = new ChromeOptions();
		ing.addArguments("incognito");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h5[text()='Alert']")).click();
//		Thread.sleep(3000);
//		-----------------normalAleart------------------
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		Thread.sleep(3000);
		alert.accept();
//		-------------confirmAlert-------------
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
//		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
//		-----------------confirmPrompt------------------
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
//		Thread.sleep(3000);
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("test_To_Alert_prompt");
//		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		System.out.println("prompt_Text_Box :" + text);
		alert2.accept();

		driver.close();
		
		
		
		
		 }

}

