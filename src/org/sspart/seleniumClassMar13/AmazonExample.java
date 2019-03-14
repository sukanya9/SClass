package org.sspart.seleniumClassMar13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		System.out.println("Opened Amazon website");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		System.out.println("Searching performed");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByVisibleText("Electronics");
		System.out.println("selected");
		//dropdown.click();
		driver.quit();	

	}

}
