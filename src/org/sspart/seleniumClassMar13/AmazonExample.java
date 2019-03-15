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
		driver.findElement(By.id("nav-your-amazon")).click();
		System.out.println("your amazon link");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sukanyaroyals9@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Amazon@9");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("login amazon account");
		
		//By using id
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		System.out.println("Searching performed");
		//By using xpath
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByVisibleText("Electronics");
		System.out.println("selected");
		//driver.findElement(By.tagName("//a[@tabindex='21']"));
		//System.out.println("Todays deal");
		driver.quit();	

	}

}
