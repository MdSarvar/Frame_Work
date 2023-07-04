package runner_Script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic_Script.Base_Test;
import pom_Script.pom_Script;

public class Runner extends Base_Test{
	@Test
	public void runScript()
	{
		pom_Script P = new pom_Script(driver);
		 P.username("Admin");
		P.pass("erg1254");
		P.logbt();
	}
	
	
	

}                