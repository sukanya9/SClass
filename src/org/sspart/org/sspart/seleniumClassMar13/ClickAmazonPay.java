package org.sspart.org.sspart.seleniumClassMar13;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAmazonPay {
	WebDriver driver=null;

	@BeforeTest
	public void selectAmazon() throws IOException, InterruptedException
	{
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
	public void select() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Pay')]")).click();
		Thread.sleep(3000);
		System.out.println(" selected amazon pay");
		
	}
	@AfterClass
	public void afterTest() {
		System.out.println("ClickAmazonPay - Test Case is executed successfully");

	}
	@AfterTest
	public void quit() {
		System.out.println("Close browser");
		driver.quit();
	}
}


