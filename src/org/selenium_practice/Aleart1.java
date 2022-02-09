package org.selenium_practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aleart1 {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
Thread.sleep(3000);
// ------------simple_Alert----------
driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
driver.switchTo().alert().accept();
//--------------confrom_Alert----------------
driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
//-------------prompt_Alert-------------
driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
Thread.sleep(3000);
driver.switchTo().alert().sendKeys("Boxer_In_Peace");
String text = driver.switchTo().alert().getText();
System.out.println("-------------prompt_Text--------------: "+text);
Thread.sleep(3000);
driver.switchTo().alert().accept();
TakesScreenshot ts = (TakesScreenshot) driver;
File auto_scn_shot = ts.getScreenshotAs(OutputType.FILE);
File path = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\Alert1.png");
FileUtils.copyFile(auto_scn_shot,path);
Thread.sleep(3000);
driver.close();
}

}
