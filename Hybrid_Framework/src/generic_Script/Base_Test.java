package generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements FrameWork_constant1 {
	public WebDriver driver;
	@BeforeMethod
	public void open_app()
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty(chrome_key, chrome_value); // implemented by interface by implements key
		driver = new ChromeDriver();
		// to Luanch the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// to enter the url
		driver.get(base_url);
		
	}
	
	@AfterMethod
	public void close_app()
	{
		driver.close();
	}

}
