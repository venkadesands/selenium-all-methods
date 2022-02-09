package org.selenium_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
//Thread.sleep(3000); /*we can't able to use after popup*/,
/*will get  org.openqa.selenium.WebDriverException:*/
driver.switchTo().alert().accept(); 
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
driver.switchTo().alert().dismiss();
driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
Alert prompt_Alert = driver.switchTo().alert();
prompt_Alert.sendKeys("Boxerinpeace");
System.out.println("Text Getting From Alert Prompt  : "+prompt_Alert.getText());
prompt_Alert.accept();



Thread.sleep(3000); driver.quit();

	}

}
