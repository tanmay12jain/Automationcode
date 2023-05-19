package Syncronization;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ExpliciteWait {

		public static void main(String[] args){
			// TODO Auto-generated method stub
			   WebDriver driver =new FirefoxDriver();
					driver.manage().window().maximize();
					driver.get("https://www.instagram.com/");
					
					WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
					WebElement usernametb = driver.findElement(By.name("username"));
			        wait.until(ExpectedConditions.visibilityOf(usernametb)).sendKeys("tanmay8238");
			        
			        WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')[4]"));
			        wait.until(ExpectedConditions.visibilityOf(button)).sendKeys("manager");
			        
		
					String acttitle = driver.getTitle();
					wait.until(ExpectedConditions.titleContains("instagram"));
					
					if(acttitle.equals("lnstagram")) {
					System.out.print("Pass: home page is dispalyed");
					}
					else
					System.out.println("Fai1:homre page is not dispalyed");
					System.out.println(driver.getCurrentUrl());
		}

	}
