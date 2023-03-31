package ChromeLaunching;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot
{
     
     static WebDriver driver;
     public static void CaptureScreenshot(WebDriver driver) throws IOException {
    	 Calendar cal = Calendar.getInstance();
 		 Date time = cal.getTime();
 		
 		String timestamp = time.toString().replace(" ", "").replace(" ", "");
 		System.out.println(time);
 		
 		System.out.println(timestamp);
        File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\FB\\"+timestamp+".png");
		FileHandler.copy(source, dest);
		
	
		
     }
     
     public static void main(String[] args) throws InterruptedException, IOException {
    	 
    	 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
 		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		CaptureScreenshot(driver);
		
     }
}
