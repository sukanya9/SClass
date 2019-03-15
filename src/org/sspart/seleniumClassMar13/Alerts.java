package org.sspart.seleniumClassMar13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("Maximize window");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.getTitle();
		System.out.println("Get title");
		driver.findElement(By.name("cusid")).sendKeys("213");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		System.out.println("submited");
		Alert a=driver.switchTo().alert();
		System.out.println("Display Alert text");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		a.getText();
		
		Thread.sleep(1000);
		a.dismiss();
		System.out.println("Dismissed alert");
		
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		a.getText();
		System.out.println("dispaly alert text");
		Thread.sleep(1000);
		a.accept();
		System.out.println("Accepting Alert");
		
		Thread.sleep(4000);
		
		driver.quit();
		System.out.println("Close the browsers");
		
	}

}
