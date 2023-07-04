package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_Script {
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Un;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement logbtn;
	
	public pom_Script(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	public void username(String un)
	{
		Un.sendKeys(un);
	
	}
	public void pass(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public void logbt()
	{
		logbtn.click();

	}
	
	
}
