package org.selenium_practice;

import java.io.File;
import java.io.IOException;
import java.time.Year;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Single_drop_down {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
ChromeOptions ing = new ChromeOptions();
ing.addArguments("incognito");
WebDriver driver = new ChromeDriver(ing);
 driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.facebook.com/login/");
	WebElement signup = driver.findElement(By.xpath("//a[@rel='nofollow']"));
	signup.click();
	driver.findElement(By.name("firstname")).sendKeys("venkkadesan");
	driver.findElement(By.name("lastname")).sendKeys("lastname");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("boxerinpeacegmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByValue("26");
	WebElement month = driver.findElement(By.id("month"));
	Select s1 = new Select(month);
	s1.selectByIndex(1);
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByVisibleText("1992");
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	driver.findElement(By.name("websubmit")).click(); 		Thread.sleep(10000);
	TakesScreenshot ts =(TakesScreenshot) driver;
	File sig_drapdown_auto_snshot = ts.getScreenshotAs(OutputType.FILE);
	File path = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\single_drop_down.png");
	FileUtils.copyFile(sig_drapdown_auto_snshot, path);		 Thread.sleep(5000);
	driver.close();
	}
	
	
	
	


	
	
}
