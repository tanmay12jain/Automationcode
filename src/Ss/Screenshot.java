package Ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Step:1 Type casting
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    //Step:2 Access the method and photo is stored in RAM
	    File RAM = ts.getScreenshotAs(OutputType.FILE);
	    
	    //Step:3 Specify the location
	    File dest = new File ("./photo/amazon.png");
	    
	    //Step:4 Copy past from RAM to required location 
	    FileUtils.copyFile(RAM, dest);
	     driver.close();
		//Typecasting
	}

}
