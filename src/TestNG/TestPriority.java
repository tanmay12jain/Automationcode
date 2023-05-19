package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPriority {
	@Test(priority = -1)
	public void settings()
	{
		Reporter.log("Hello, true");
	}

	@Test(priority = 1, invocationCount = 5, enabled =false)
	public void zem()
	{
		Reporter.log("calls", true);
	}
	@Test(priority = -1)
	public void hen()
	{
		Reporter.log("kachelo", true);
	}


}
