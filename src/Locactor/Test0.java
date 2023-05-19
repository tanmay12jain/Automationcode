package Locactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0  {
	
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
//maximize
driver.manage().window().maximize();		
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("tomjarry2727@gmail.com");
driver.findElement(By.name("pass")).sendKeys("chunnu@4321");
driver.findElement(By.name("login")).click();
}
}
