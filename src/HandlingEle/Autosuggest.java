package HandlingEle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchbox.sendKeys("Dress");
		Thread.sleep(3000);
		List<WebElement> autosugression = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(autosugression.size());
		for(WebElement b : autosugression) {
			System.out.println(b.getText());
		
		}
			
		
	}

}
