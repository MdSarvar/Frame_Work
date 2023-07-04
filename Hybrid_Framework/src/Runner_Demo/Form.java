package Runner_Demo;

import org.testng.annotations.Test;

import Genric_DemoQa.Base_Test1;
import Pom_Demo.Pom_QA;
import pom_Script.pom_Script;

public class Form extends Base_Test1 {
	@Test
	public void run()
	{
		Pom_QA  pf= new Pom_QA(driver);
		pf.FN("Md Sarvar");
		pf.Lastname("Shaikh");
	}

}
