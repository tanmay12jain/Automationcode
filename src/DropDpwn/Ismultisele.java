package DropDpwn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Ismultisele {

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
	    List<WebElement> alloptions = s.getOptions();
	    for(WebElement b : alloptions) {
        	System.out.println(b.getText());
	    }
		System.out.println(alloptions.size());
        System.out.println(s.isMultiple());
        if (s.isMultiple()) {
        s.deselectAll();
        }
        else {
        	System.out.println("it is not multiple select dropdown");
        }
	}

}
