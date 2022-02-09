package org.selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Practice {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");
String title = driver.getTitle();
System.out.println(title);
driver.get("https://www.facebook.com/login/");
driver.findElement(By.id("email")).sendKeys("venkadesands1992@gmail.com");
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("1231@abc");
boolean displayed = password.isDisplayed();
System.out.println("password is displayed :"+displayed);
boolean enabled = password.isEnabled();
System.out.println("password is enabled :"+enabled);
boolean selected = password.isSelected();
System.out.println("password is selected :"+selected);
driver.findElement(By.name("login")).click();

	}

}
