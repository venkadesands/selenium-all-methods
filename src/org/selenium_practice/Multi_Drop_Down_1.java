package org.selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Multi_Drop_Down_1 {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.leafground.com/");
driver.findElement(By.xpath("//img[@alt='ListBox']")).click(); 	Thread.sleep(3000);
WebElement single1 = driver.findElement(By.id("dropdown1"));
Select s = new Select(single1);		s.selectByValue("2");
WebElement visible_Text = driver.findElement(By.name("dropdown2"));
Select s1 = new Select(visible_Text);	s1.selectByVisibleText("UFT/QTP");
WebElement value = driver.findElement(By.id("dropdown3"));
Select s2 = new Select(value);		s2.selectByValue("4");
WebElement using_Index = driver.findElement(By.className("dropdown"));
Select s3 = new Select(using_Index); 	s3.selectByIndex(2);
WebElement send_Keys = driver.findElement(By.xpath("(//select)[5]"));
send_Keys.sendKeys("selenium");
WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
Select s4 = new Select(multi);
boolean multiple = s4.isMultiple(); /*ismultiple*/
System.out.println("check is multiple"+ multiple);
s4.selectByIndex(1);	s4.selectByValue("2"); 	s4.selectByVisibleText("Loadrunner");
List<WebElement> options = s4.getOptions();
System.out.println("-----------All Options----------");
for (WebElement webElement : options) {	
	System.out.println(webElement.getText()); }
System.out.println("-----------All Selected Option----------------");
List<WebElement> allSelectedOptions = s4.getAllSelectedOptions();
for (WebElement webElement1 : allSelectedOptions) {
	System.out.println(webElement1.getText());	}
System.out.println("--------------First Selected Option--------");
WebElement firstSelectedOption = s4.getFirstSelectedOption();
System.out.println(firstSelectedOption.getText());
s4.deselectAll();

Thread.sleep(4000);
driver.quit();
	}

}
