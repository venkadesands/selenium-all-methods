package org.selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\Driver\\chromedriver.exe");
ChromeOptions ing = new ChromeOptions();
ing.addArguments("incognito");
WebDriver driver = new ChromeDriver(ing);
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");
driver.navigate().to("https://www.amazon.in/");
driver.navigate().back(); 		/*Thread.sleep(2000);*/

driver.navigate().back();		Thread.sleep(3000);
//String tap_title1 = driver.getTitle(); 
System.out.println("current page tap_title is :"+driver.getTitle());
//System.out.println(tap_title1);

driver.navigate().refresh();	/*Thread.sleep(1000);*/

driver.navigate().forward();	Thread.sleep(1000);

driver.navigate().forward();	Thread.sleep(2000);

String tap_title = driver.getTitle();
System.out.println("\n current page tap_title is :\n "+tap_title);
String currentUrl = driver.getCurrentUrl();
System.out.println("\n current page URL is : \n "+currentUrl);
WebElement firsthere = driver.findElement(By.xpath("(//span[contains(text(),'Hello')])[2]"));
firsthere.click();
//signup.click();
WebElement name = driver.findElement(By.name("customerName"));
name.sendKeys("venkadesan");
driver.quit();

	}
	

}
