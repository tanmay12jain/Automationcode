package Syncronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impwaits {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		   WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("password")).sendKeys("manager");
				driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')[4]"));
				String acttitle = driver.getTitle();
				
				if(acttitle.equals("lnstagram")) {
				System.out.print("Pass: home page is dispalyed");
				}
				else
				System.out.println("Fai1:homre page is not dispalyed");
				System.out.println(driver.getCurrentUrl());
	}

}
