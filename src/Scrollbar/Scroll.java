package Scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");

				WebDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement tdeal = driver.findElement(By.xpath("//img[@alt ='Natural Finish Solid Sheesham Wood 6 Seater Dining Table with 6 Chairs for Home & Office | Hotel & Restaurant| Honey Finish']"));
				//Typecasting
				Point loc = tdeal.getLocation();
				int x = loc.getX();
				int y = loc.getY();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy("+x+","+y+")");
				Thread.sleep(5000);		
				tdeal.click();
				
	}

}
