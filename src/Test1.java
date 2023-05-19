import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {
	
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

	WebDriver driver = new ChromeDriver(options);
driver.get("https://www.amazon.in/AGARO-Marvel-Toaster-Griller-Rotisserie/dp/B07N2J9D87/ref=as_li_ss_tl?dchild=1&keywords=agaro%2Botg&qid=1610280074&sr=8-3&th=1&linkCode=sl1&tag=cookingshooki-21&linkId=c12bb103440943f2bc23e0e287da5a04&language=en_IN");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
Thread.sleep(3000);
driver.close();
}
}