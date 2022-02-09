package org.selenium_practice;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screen_Shot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com/");
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	Thread.sleep(3000);
driver.findElement(By.name("firstname")).sendKeys("venkadesan");
driver.findElement(By.name("lastname")).sendKeys("DS");
driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("boxerinpeace@gmail.com");
driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("boxerpeace@gmail.com");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123@abc");
WebElement day = driver.findElement(By.id("day"));
Select s = new Select(day);
s.selectByValue("26");
WebElement month = driver.findElement(By.id("month"));
Select s1= new Select(month);
s1.selectByIndex(1);
WebElement year = driver.findElement(By.id("year"));
Select s2 = new Select(year);
s2.selectByVisibleText("1992");
driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
driver.findElement(By.name("websubmit")).click();
Thread.sleep(5000);
TakesScreenshot ts = (TakesScreenshot) driver;
File screenshot1 = ts.getScreenshotAs(OutputType.FILE);
File path = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\createAcc1.png");
FileUtils.copyFile(screenshot1, path); Thread.sleep(3000);
driver.quit();

	}

}
