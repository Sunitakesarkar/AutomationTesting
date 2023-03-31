package ChromeLaunching;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshotwithtimedate {
	 static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException  
{
		
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		
		String timestamp = time.toString().replace(":", "").replace(" ", "");
		System.out.println(time);
		
		System.out.println(timestamp);
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		// WebDriver driver = new ChromeDriver();
		 ChromeOptions options = new ChromeOptions(); 
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
	    driver.manage ().window().maximize();
	    Thread.sleep(2000);
	    
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\FB\\Test"+timestamp+".png");
		FileHandler.copy(source, dest);
		Thread.sleep(3000);
		
		WebElement CreateNewAccount= driver.findElement(By.xpath("//*[text() = 'Create new account']"));
		CreateNewAccount.click();
			
		Thread.sleep(3000);
	
		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\FB\\Test"+timestamp+".png");
		FileHandler.copy(source1, dest1);
		
		Thread.sleep(3000);
		
		driver.close();
}
}
