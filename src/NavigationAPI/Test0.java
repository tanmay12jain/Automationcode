package NavigationAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
//maximize
driver.manage().window().maximize();		
driver.get("https://www.amazon.in/AGARO-Marvel-Toaster-Griller-Rotisserie/dp/B07N2J9D87/ref=as_li_ss_tl?dchild=1&keywords=agaro%2Botg&qid=1610280074&sr=8-3&th=1&linkCode=sl1&tag=cookingshooki-21&linkId=c12bb103440943f2bc23e0e287da5a04&language=en_IN");
Thread.sleep(3000);
driver.navigate().to("https://www.facebook.com/");

driver.navigate().back();
Thread.sleep(3000);

driver.navigate().forward();
Thread.sleep(3000);

driver.navigate().refresh();

driver.close();
}
}