package org.sspart.org.sspart.seleniumClassMar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchiPhone   {
WebDriver driver;
		@BeforeTest
		public void browser() throws InterruptedException {
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
		public void search() throws InterruptedException{
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			System.out.println("Search performed");
			Thread.sleep(3000);
		}
		@AfterClass
		public void afterTest() {
			System.out.println("SearchiPhone - Test Case is executed successfully");

		}
		@AfterTest
		public void quit() {
			driver.quit();
		}

}
