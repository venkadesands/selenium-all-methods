
package org.selenium_practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multi_Drop_Down {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions ing = new ChromeOptions();
		ing.addArguments("incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement multidrop = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multidrop);
		System.out.println("------DropDown_Is_Multiple_Or_Not--------");
		boolean check_Multi = s.isMultiple();
		System.out.println("Is_Multiple=true_Or_Not=False  \n "+check_Multi);
		s.selectByIndex(1);
		s.selectByValue("3");
		s.selectByVisibleText("Loadrunner");		Thread.sleep(3000);
		s.deselectByVisibleText("Selenium");  		Thread.sleep(3000); 
		s.selectByIndex(2);
		System.out.println("all belove reference to tester get KT to previous testing ticket's");
		System.out.println("-----------Get Options--------");
		List<WebElement> alloptions = s.getOptions();
		for (WebElement webElement : alloptions) {
		String allskills = webElement.getText();
		System.out.println(allskills);
				}
		System.out.println("--------------Get_All_Selected_Options");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
			}
		System.out.println("----------What_We_Select_The_First-------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		System.out.println("------------Successfully_Done_Today_Task------------------"); 
		Thread.sleep(6000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File multi_Dropdown_Scn_Sht = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\multi_Dropdown.png");
		FileUtils.copyFile(multi_Dropdown_Scn_Sht, path);
		Thread.sleep(3000);
		driver.close();
	}

}
