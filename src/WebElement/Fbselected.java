package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fbselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement login = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		login.click();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));

		// Select the male radio button
		maleRadioButton.click();

		// Verify that the male radio button is enabled
		if (maleRadioButton.isEnabled()) {
		    System.out.println("Male radio button is enabled.");
		} else {
		    System.out.println("Male radio button is not enabled.");
		}

		// Verify that the female radio button is enabled
		if (femaleRadioButton.isEnabled()) {
		    System.out.println("Female radio button is enabled.");
		} else {
		    System.out.println("Female radio button is not enabled.");
		}
	}

}
