package org.sspart.seleniumClassMar13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class SeleniumClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\nUsers\\welcome\\Downloads\\chromedriver_win32");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("sukanya");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		//Thread.sleep(2000);
		driver.quit();

	}

}
