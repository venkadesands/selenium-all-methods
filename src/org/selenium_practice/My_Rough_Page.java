package org.selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Rough_Page {


	public static void main(String[] args) throws Throwable {
//System.setProperty("webdriver.chromre.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//WebDriver driver =new ChromeDriver();
//driver.get("https://www.google.co.in/");
//driver.manage().window().maximize();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/"); Thread.sleep(3000);
driver.navigate().to("https://www.youtube.com/"); 	Thread.sleep(3000);
driver.navigate().to("https://mail.google.com/");
driver.navigate().back(); 	Thread.sleep(3000);
System.out.println("After the back1(current page title) :"+driver.getTitle());		Thread.sleep(2000);
System.out.println("After the back1(current page url) :"+driver.getCurrentUrl());	Thread.sleep(2000);
driver.navigate().back(); 	Thread.sleep(3000);
System.out.println("After the back2(current page title) :"+driver.getTitle());		Thread.sleep(2000);
System.out.println("After the back2(current page url) :"+driver.getCurrentUrl());	Thread.sleep(2000);
driver.navigate().forward(); 	Thread.sleep(3000);
System.out.println("After the forward1(current page title) :"+driver.getTitle());		Thread.sleep(2000);
System.out.println("After the forward1(current page url) :"+driver.getCurrentUrl());	Thread.sleep(2000);
driver.navigate().refresh(); 	Thread.sleep(4000);
driver.navigate().refresh();	Thread.sleep(2000);
System.out.println("After the 2nd refresh(current page title) :"+driver.getTitle());		Thread.sleep(2000);
System.out.println("After the 2nd refresh(current page url) :"+driver.getCurrentUrl());	Thread.sleep(2000);
driver.navigate().forward();	Thread.sleep(3000);
 System.out.println("After the forward2(current page title) :"+driver.getTitle());		Thread.sleep(2000);
 System.out.println("After the forward2(current page url) :"+driver.getCurrentUrl());	Thread.sleep(2000);

//System.out.println("current page:"+driver.getPageSource());	 Thread.sleep(2000);
driver.quit();

	}

}
