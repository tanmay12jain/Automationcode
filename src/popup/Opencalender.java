package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Opencalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");

				WebDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://demo.actitime.com/login.do");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.id("loginButton")).click();
				driver.findElement(By.id("ext-gen29")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text() = '18']")).click();
				Thread.sleep(3000);
				driver.close();
	}

}
