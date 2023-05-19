package DropDpwn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement dropdown = driver.findElement(By.id("cars"));
	    Select s = new Select(dropdown);
	    s.selectByIndex(0);
	    Thread.sleep(2000);
	    s.selectByValue("99");
	    Thread.sleep(2000);
	    s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
	    Thread.sleep(2000);
	    s.deselectByIndex(0);
	    Thread.sleep(2000);
	    s.deselectByValue("99");
	    Thread.sleep(2000);
	    s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
	   driver.close();
	}

}
