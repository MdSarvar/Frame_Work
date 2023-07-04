package Pom_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_QA {
	@FindBy(id="firstName")
	public WebElement fn;
	
	@FindBy(id="lastName")
	public WebElement ls;
	
	@FindBy(id="userEmail")
	public WebElement uemail;
	
	@FindBy(xpath = "//label[text()='Male']")
	public WebElement radio_btn;
    
	@FindBy(id="userNumber")
	public WebElement mob_no;
	
	@FindBy(id="dateOfBirthInput")
	public WebElement dob;
	
	/*@FindBy(xpath = "//option[text()='February']")
	public WebElement month_Drop;
	
	@FindBy(xpath = "//option[text()='2021']")
	public WebElement year_drop;*/
	
	@FindBy(id="subjectsContainer")
	public WebElement subj;
	
	@FindBy(xpath = "//label[text()='Music']")
	public WebElement hobby;
	
	@FindBy(id="uploadPicture")
	public WebElement upload;
	
	@FindBy(id="currentAddress")
	public WebElement currentAdd;
	
	public Pom_QA(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void FN(String un)
	{
		fn.sendKeys(un);
	
	}
	
	public void Lastname(String lastn)
	{
		ls.sendKeys(lastn);
	
	}
	
	public void useeemail(String email)
	{
		uemail.sendKeys(email);
	
	}
	
}
