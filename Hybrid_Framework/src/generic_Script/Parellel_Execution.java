package generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parellel_Execution {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void Parl_test1(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
			driver.get("https:www.google.com");
		}
		else {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		}
	}

}
