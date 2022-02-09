package org.selenium_practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class Project_Automation_Practice {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chrome\\chromedriver.exe");

ChromeOptions ing = new ChromeOptions();
ing.addArguments("incognito");
WebDriver driver = new ChromeDriver(ing);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.google.com/");
//driver.findElement(By.name("q")).sendKeys("automation Practice");
WebElement searchOnGoogle = driver.findElement(By.name("q"));
searchOnGoogle.sendKeys("automation Practice");
Thread.sleep(3000);
//driver.findElement(By.className("wM6W7d")).click();
WebElement search = driver.findElement(By.className("wM6W7d"));
 search.click();
//driver.findElement(By.xpath("//h3[text()='Automation Practice']")).click();
 WebElement select_webpage = driver.findElement(By.xpath("//h3[text()='Automation Practice']"));
 select_webpage.click();
WebElement click_On_Women = driver.findElement(By.xpath("//a[@title=\"Women\"]"));
click_On_Women.click();
WebElement click_Printed_Dress = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]")); 
click_Printed_Dress.click();
WebElement dress_Quantity = driver.findElement(By.name("qty"));
dress_Quantity.clear();
dress_Quantity.sendKeys("5");
WebElement size = driver.findElement(By.xpath("//select[contains(@class,'form-con')]"));
Select s = new Select(size);
s.selectByValue("3");
WebElement add_to_cart = driver.findElement(By.xpath("//span[text()='Add to cart']")); 
add_to_cart.click();
//WebElement proceed_Frame = driver.findElement(By.className("clearfix"));
//driver.switchTo().frame(proceed_Frame);
//WebElement proceed_To_Checkout = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
//proceed_To_Checkout.click();
//driver.switchTo().defaultContent();
WebElement proceed_To_Checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']")); 
proceed_To_Checkout.click();
WebElement minimize_Quantity = driver.findElement(By.xpath("//i[@class='icon-minus']"));
minimize_Quantity.click();
WebElement proceed_To_Checout1 = driver.findElement(By.xpath("(//a[contains(@title,'Proceed to c')])[2]"));
proceed_To_Checout1.click(); 
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("venkadesands1992@gmail.com");
WebElement passWord = driver.findElement(By.id("passwd"));
passWord.sendKeys("Venky@123");
WebElement login = driver.findElement(By.id("SubmitLogin"));
login.click();
WebElement Checkout_In_Address = driver.findElement(By.name("processAddress"));
Checkout_In_Address.click();
WebElement click_On_Agree = driver.findElement(By.id("cgv"));
click_On_Agree.click();
WebElement checkOut_In_Shipping = driver.findElement(By.name("processCarrier"));
checkOut_In_Shipping.click();
WebElement pay_By_Check = driver.findElement(By.className("cheque"));
pay_By_Check.click();
WebElement confirm_My_Order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
confirm_My_Order.click();
// **********new acc_Open******************* 
//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("venkadesands11992@gmail.com");
//driver.findElement(By.id("SubmitCreate")).click();			/* create new account after submit of mail id */
//driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();    	/* mr*/
//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("venkadesan");
//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("DS");
//driver.findElement(By.id("passwd")).sendKeys("Venky@123"); 	/*password*/
//WebElement days = driver.findElement(By.id("days"));
//Select s1 = new Select(days);
//s1.selectByValue("26");
//WebElement month = driver.findElement(By.id("months"));
//Select s2 = new Select(month);
//s2.selectByValue("2");
//WebElement year = driver.findElement(By.id("years"));
//Select s3 = new Select(year);
//s3.selectByValue("1992");
//driver.findElement(By.id("firstname")).sendKeys("venkadesan");   /* adress*/
//driver.findElement(By.id("lastname")).sendKeys("DS");
//driver.findElement(By.id("company")).sendKeys("self_Entrepreneur_pvt_ltd");
//driver.findElement(By.id("address1")).sendKeys("ramapuram,Chennai-89");
//driver.findElement(By.id("city")).sendKeys("Chennai");
//WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
//Select s4 = new Select(state);
//s4.selectByVisibleText("US Virgin Islands");
//driver.findElement(By.id("postcode")).sendKeys("00882");
//WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
//Select s5 = new Select(country);
//s5.selectByValue("21");
//driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("+912323434343");	/*mobile number*/
//driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("chennai_India");
//driver.findElement(By.id("submitAccount")).click();		/* Register */
//WebElement final_Checkout = driver.findElement(By.name("processAddress"));
//final_Checkout.click();
//driver.findElement(By.id("cgv")).click();
//driver.findElement(By.name("processCarrier")).click();
//driver.findElement(By.className("cheque")).click();
//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//WebElement back_To_Add = driver.findElement(By.xpath("//a[@title='Back to orders']"));
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("Argument[0].scrollintoview()",back_To_Add);
//
//TakesScreenshot ts = (TakesScreenshot) driver;
//File source = ts.getScreenshotAs(OutputType.FILE);
//File path = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\Automation_Practice.png");
//FileUtils.copyFile(source, path);
//
//
//

Thread.sleep(5000);

driver.quit();



	}

}
