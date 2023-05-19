package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FbTc01 {
	public WebDriver driver ;
	@BeforeMethod
	public void openapp()
	
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void tc1()
	{
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@name = 'login']")).click(); 
		String title = driver.getTitle();
		//Assert.assertEquals(title, "hello");
		SoftAssert a = new SoftAssert();
		a.assertEquals(title, "Hello");
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		a.assertAll();
		
	}

	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
