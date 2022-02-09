package org.selenium_practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {
//------- Drag&Drop -----------Click&hold----Movetoelement-release
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement fromElement = driver.findElement(By.id("draggable")); 
		Thread.sleep(3000);
		WebElement toElement = driver.findElement(By.id("droppable"));
//		a.dragAndDrop(fromElement, toElement).build().perform(); /*using dragandDrop method*/
		
		/*using clikandHold method*/		
		a.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\drag&drop.png");
		FileUtils.copyFile(screenshotAs, path);
//		driver.close();
	}

}
