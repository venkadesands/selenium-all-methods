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
import org.openqa.selenium.chrome.ChromeOptions;

//-----------------x path finding and Practicing-----------------------
//		(//input[contains(@class,'inputtext ')])[1] --- mail box address
//		//input[@type='password']  ----- password box address
//		//button[text()='Log In']   ----- login putton address
//		//a[text()='Mobiles']  --------- amazon mobile link address
//		//a[text()='Facebook']  ------------amazon bottom side facebook address
//		(//a[@tabindex='0'])[12] ------- amazon top side amazonpay address
//		(//span[contains(@class,'nav')])[23] -----amazon upside cart adddress
public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions ing = new ChromeOptions();
		ing.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ing);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement newaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newaccount.click();
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("venkadesan");
		WebElement secoundname = driver.findElement(By.name("lastname"));
		secoundname.sendKeys("DS");
		WebElement emailaddress = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		emailaddress.sendKeys("venadesands1992@gmail.com");
		WebElement reentermail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		reentermail.sendKeys("venadesands1992@gmail.com");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("aTOz@132");
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
		Thread.sleep(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File auto_scn_shot = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\snap2.png");
		FileUtils.copyFile(auto_scn_shot, path);
		Thread.sleep(3000);

		driver.close();

	}
}
