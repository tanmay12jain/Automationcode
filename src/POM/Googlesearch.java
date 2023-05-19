package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlesearch {

	@FindBy(name = "q")
	private WebElement search;
	
	public Googlesearch (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void keywoard(String name)
	{
		search.sendKeys(name );
	}

}
