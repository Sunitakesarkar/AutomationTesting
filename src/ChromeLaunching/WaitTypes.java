package ChromeLaunching;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	public static void main(String[] args) throws IOException, InterruptedException
	{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
	        
			driver.get("https://demoqa.com/droppable");
			driver.manage ().window().maximize();
			Thread.sleep(3000);
			
			//1.Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	WebElement LoginButton= driver.findElement(By.xpath("//*[@id='draggable']"));
		//	WebElement LoginButton= driver.findElement(By.xpath("//*[text()='Log in']"));
			
			
			//2.Explicit wait
	//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));   //500ms interval
	//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='draggable']")));
			
			//3.Fluent wait  (waiting time + condition + polling frequency)s
			Wait<WebDriver> wait1 =new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchElementException.class);
			WebElement LoginButton= driver.findElement(By.xpath("//*[@id='draggable']"));
			
			driver.close();
	}
}
