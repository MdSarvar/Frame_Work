package Genric_DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base_Test1 {
	public WebDriver driver;
	@BeforeMethod
	public void luanch_DemoApp()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@AfterMethod
	public void close_app()
	{
		//this comment for close the window
		driver.close();
	}

}
