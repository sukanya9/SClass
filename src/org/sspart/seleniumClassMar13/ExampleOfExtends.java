package org.sspart.seleniumClassMar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class ExampleOfExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in");
System.out.println("opened");
driver.findElement(By.id("nav-your-amazon")).click();
//driver.findElement(By.xpath("//*[@id="nav-link-yourAccount"]/span[1])").click();
driver.quit();
	}

}
