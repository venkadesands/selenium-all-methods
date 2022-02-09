package org.selenium_practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		// --------------------frames-------------------------------
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.className("analystic")).click();
		WebElement sng_Frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(sng_Frame);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("yogaraj");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
// ---------------------takescreenshot-------------------------
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\frame.png");
		FileUtils.copyFile(source, path);
		Point position = new Point(300, 230);
		driver.manage().window().setPosition(position);
//------------------minimize----------------------
		Point position1 = new Point(400, 550);
		driver.manage().window().setPosition(position1);
		Thread.sleep(3000);
		

		driver.quit();

	}

}
