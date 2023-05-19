package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassActitime {
	//Initialization

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	//Declaration
	public PomClassActitime (WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void username(String user)
	{
		username.sendKeys(user);
	}
	
	public void passwordtb(String pass)
	{
		passwordtb.sendKeys(pass);
	}
	
	public void loginbtn()
	{
		loginbtn.click();
	}
}
