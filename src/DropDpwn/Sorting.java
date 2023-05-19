package DropDpwn;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Sorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
		Thread.sleep(3000);
	    WebElement month = driver.findElement(By.id("month"));
	    Select s = new Select(month);
	    s.selectByIndex(1);
	    Thread.sleep(2000);
	    s.selectByValue("5");
	    Thread.sleep(2000);
	    s.selectByVisibleText("May");
	    
	    List<WebElement> alloptions = s.getOptions();
	    System.out.println(alloptions.size());
	    
	    ArrayList a = new ArrayList<>();
	    
	    for(WebElement b : alloptions) {
	    	String text = b.getText();
	    	a.add(text);
        	System.out.println(text);
      
	    }
		System.out.println("----------after shorting-----");
	    Collections.sort(a);
	    for (Object options1 : a) {
	    	System.out.println(options1);
	    }
	    driver.close();
	}

}
