package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Changeframs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sign = driver.findElement(By.xpath("//span[text() = 'Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(sign).perform();
	    Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//a[text() = 'login']"));
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.name("username")).sendKeys("+911234567898");
		Thread.sleep(1000);
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name= 'keyword'][1]")).sendKeys("phone");
		driver.close();
		}

}
