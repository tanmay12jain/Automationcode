package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Hoveringelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement kids = driver.findElement(By.xpath("(//a[text() = 'Kids'][1])"));
		Actions a = new Actions(driver);
		a.moveToElement(kids).perform();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() = 'Dungarees & Jumpsuits']")).click();
		
	}

}
