package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GenReport {
	
	@Test
	public void demo()
	{
		Reporter.log("Hello", true);
		Reporter.log("Hello Selenium", false);
	}

}
