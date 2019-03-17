package org.sspart.seleniumClassMar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
				//Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("Maximize window");
		driver.get("http://demo.guru99.com/popup.php");
		System.out.println("Maximized");
		driver.close();
	}

}
