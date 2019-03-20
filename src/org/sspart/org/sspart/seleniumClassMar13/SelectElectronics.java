package org.sspart.org.sspart.seleniumClassMar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectElectronics {
	WebDriver driver;
	@BeforeTest
	public void openAmazonHome() throws InterruptedException{
		System.out.println("Open chrome browser");
  	   	   	 
    	if(driver==null) {
    		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    		driver = new ChromeDriver();
    		//driver.manage().window().maximize(); 
    	}else {
    		System.out.println("not able to open chrome");
    	}
		System.out.println("Amazon home apge");
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	}
	@Test
	public void selectdropdown() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByVisibleText("Electronics");
		System.out.println("Selcted by visible text");
		Thread.sleep(2000);
		System.out.println("Dropdown selected");
	}
	@AfterTest
	public void close() {
	System.out.println("close");
	driver.close();
	}
	@AfterClass
	public void afterTest() {
		System.out.println("SelectElectronics dropdown - Test Case is executed successfully");

	}
}
