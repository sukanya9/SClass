package org.sspart.seleniumClassMar13;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class SeleniumSwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
			
			driver.get("http://demo.guru99.com/popup.php");
			String currentWindowHandle= driver.getWindowHandle();
			driver.findElement(By.linkText("Click Here")).click();
			
			System.out.println("Selected button");
			try{
			Thread.sleep(4000);
			}catch(InterruptedException e)
			{
			e.printStackTrace();
			}
			
			Set<String> windowHandles=driver.getWindowHandles();
			
			for(String eachHandle : windowHandles) {
				driver.switchTo().window(eachHandle);
				Thread.sleep(4000);
				boolean bool = false;
				try {
					bool =driver.findElement(By.xpath("//*input[@name=\"emailid\"]")).isDisplayed();	
				}catch(Exception ignore){}
					
				if(bool) {
					driver.close();
				}
				//driver.getTitle().contains(" Guru99 Bank Home Page ");
			}
			 
			driver.close();
			driver.switchTo().window(currentWindowHandle);
			System.out.println("Window handled");
			driver.quit();
	}

	}

