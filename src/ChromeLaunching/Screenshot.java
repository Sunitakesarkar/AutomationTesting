package ChromeLaunching;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshot {
	 int i =0;
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		
		String timestamp = time.toString().replace(" ", "").replace(" ", "");
		System.out.println(time);
		
		System.out.println(timestamp);
		
		
		int i =0;
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
	    driver.manage ().window().maximize();
	    Thread.sleep(3000);
	    
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\FB\\Test"+timestamp+".png");
		FileHandler.copy(source, dest);
		i++;
		
		WebElement CreateNewAccount= driver.findElement(By.xpath("//*[text() = 'Create new account']"));  //with the help of text
		CreateNewAccount.click();
			
		Thread.sleep(3000);
	//captureScreenshot
		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Screenshots\\Test"+i+".png");
		FileHandler.copy(source1, dest1);
		
		i++;
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Screenshot of Section
	//	Thread.sleep(3000);
	//	WebElement Section = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form"));
	//	File source2 =Section.getScreenshotAs(OutputType.FILE);
	//	File dest2 = new File("C:\\Screenshots\\Test"+i+".png");
	//	FileHandler.copy(source2, dest2);
		
		
	//	i++;
		
		driver.close();
	}
}
