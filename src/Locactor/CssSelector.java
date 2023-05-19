package Locactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("testtj1986@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345@Qa");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
