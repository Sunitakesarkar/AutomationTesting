package ChromeLaunching;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {
	

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		
		String timestamp = time.toString().replace(":", "").replace(" ", "");
		System.out.println(time);
		
		System.out.println(timestamp);
			
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
	WebDriver driver =new ChromeDriver();
       
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage ().window().maximize();
	Thread.sleep(3000);
            
   String url= driver.getCurrentUrl();
   System.out.println(url);
			   
    WebElement username=	driver.findElement(By.xpath("//input[@name='username']"));
    WebElement password=	driver.findElement(By.xpath("//input[@name='password']"));
	Thread.sleep(3000);
	username.click();
	username.sendKeys("Admin");
	Thread.sleep(3000);
	password.click();
	password.sendKeys("admin123");
	Thread.sleep(8000);
//	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File dest = new File("C:\\OrangeHrm\\Test"+timestamp+".png");
//	FileHandler.copy(source, dest);
//	Thread.sleep(8000);
	WebElement Login=	driver.findElement(By.xpath("//button[@type='submit']"));
	Login.click();
	Thread.sleep(5000);
				 
//	File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File dest1 = new File("C:\\OrangeHrm\\Test"+timestamp+".png");
//	FileHandler.copy(source1, dest1);
//	Thread.sleep(8000);
	
	WebElement admin = driver.findElement(By.xpath("(//*[text()='Admin'])[1]"));

	Actions act = new Actions(driver);
	act.moveToElement(admin).perform();
     Thread.sleep(8000);
     String text=admin.getText();
     System.out.println(text);
//    File source2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// 	File dest2 = new File("C:\\OrangeHrm\\Test"+timestamp+".png");
// 	FileHandler.copy(source2, dest2);
// 	Thread.sleep(5000);
 	admin.click();
 	Thread.sleep(8000);
 	WebElement user = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
 	user.click();
 	user.sendKeys("Abc");
 	Thread.sleep(5000);
    File source3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	File dest3 = new File("C:\\OrangeHrm\\Test"+timestamp+".png");
 	FileHandler.copy(source3, dest3);
 	Thread.sleep(3000);
 	WebElement pim = driver.findElement(By.xpath("//*[text()='PIM']"));
 	pim.click();
 	WebElement Jobtitle = driver.findElement(By.xpath("(//select[@class='oxd-select-text-input'])[3]"));
 	Jobtitle.click();	
 //	WebElement Day=  driver.findElement(By.xpath("//select[@id = 'day']"));
	Select s = new Select (Jobtitle);
	Thread.sleep(3000);
	s.selectByVisibleText("Adminsitrator");
	Thread.sleep(3000);
 	
 	
 	
 	Thread.sleep(3000);
	WebElement adminstr = driver.findElement(By.xpath("//*[text()='Adminsitrator']"));	
	adminstr.click();
	Thread.sleep(3000);
					

}
}