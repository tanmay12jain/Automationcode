package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement hover = driver.findElement(By.id("course"));
		Actions h = new Actions(driver);
		h.moveToElement(hover).perform();
		
		driver.findElement(By.xpath("(//a[text() = 'Selenium Training'][1])")).click();
		WebElement plusbtn = driver.findElement(By.id("add"));
		Actions d = new Actions(driver);
		Thread.sleep(3000);
		d.doubleClick(plusbtn).perform();
	}

}
