package Locactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testtj1986@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345@Qa");
		driver.findElement(By.xpath("(//div[@class=\"_6ltg\"])[1]")).click();
		Thread.sleep(3000);
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	    if(actualtitle.equals("(8) Facebook")) {
	    	System.out.println("Pass:Home page is displayed");
	    	
	    }
	    else 
	    {
	    	System.out.println("Fails:Home page is not displayed");
	    }
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	   
	}

}
