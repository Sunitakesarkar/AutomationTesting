package ChromeLaunching;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert_msg {
	
	static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException
{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
	//	WebDriver driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/alerts");
		driver.manage ().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

			js.executeScript("window.scrollBy(0 , 200)");       //Scroll down
			Thread.sleep(3000);
		
	  //  WebElement button=	driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		
		 WebElement button=	driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		Thread.sleep(3000);
		button.click();
		//*[@id="promtButton"]
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();   //switch focus
		
		String text=alt.getText();   //to send the text in input field of the alert
		
	//	alt.dismiss();  //to cancel the alert
		alt.sendKeys("TestAbcd");	
		Thread.sleep(3000);
    	alt.accept();   //it will accept the alert
		
		System.out.println(text);
		
		
		
}
}
