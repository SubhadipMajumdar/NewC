import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.findElement(By.xpath("//span[@class='login-register']")).click();
		driver.findElement(By.xpath("//a[@class='event_internal_link']")).click();
	       Set<String> windows=driver.getWindowHandles();
	        Iterator<String> it=windows.iterator();
	        String p=it.next();
	        String c=it.next();
	       // String c1=it.next();
	        driver.switchTo().window(c);
	     
	        driver.findElement(By.xpath("//button[@class='underline text-primaryCta lg:text-base leading-light font-montserratSemiBold font-semibold']")).click();
	      
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("subhadipmajumdar541@gmail.com");    
	       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Subhadip@1");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/button")).click();
	      
	       
	       
	       
	       
	     

	}

}
