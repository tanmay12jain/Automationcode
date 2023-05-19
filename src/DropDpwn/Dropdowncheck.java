package DropDpwn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");

				WebDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
			    Select s = new Select(dropdown);
			    s.selectByIndex(1);
			    Thread.sleep(3000);
			    s.selectByValue("search-alias=amazon-pharmacy");
			    Thread.sleep(3000);
				s.selectByVisibleText("Amazon Fashion");
				List<WebElement> alloptions = s.getOptions();
				System.out.println(alloptions.size());
                for(WebElement b : alloptions) {
                	System.out.println(b.getText());
                	
                }
	}

}
