package popup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=Cj0KCQjwi46iBhDyARIsAE3nVrbGq39MrpG9YqbK-sKcWZtyadFKKGnIUtPowULNDdMYaBGKDEIxYg0aAk5eEALw_wcB&gclsrc=aw.ds");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()= 'Upload Resume']")).click();
		Runtime.getRuntime().exec("C:\\Users\\FCI1701\\Documents\\Autoit\\uploadpop.exe");
		

	}

}
