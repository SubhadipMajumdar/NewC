import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		driver.get("https://tide.com/en-us");
		
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		action.moveToElement(driver.findElement(By.xpath("(//a[@class='menu-item-title event_menu_click '])[1]"))).build().perform();
		
		driver.findElement(By.xpath("(//span[@itemprop='name'])[1]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='button'])[2]")));
		
		driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ps-button-label'])[2]")));
		
		driver.findElement(By.xpath("(//span[@class='ps-button-label'])[1]")).click();

	}

}
