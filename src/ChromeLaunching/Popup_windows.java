package ChromeLaunching;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup_windows 
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException
	{
			
		//	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
		//	WebDriver driver =new ChromeDriver();
		 ChromeOptions options = new ChromeOptions(); 
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("https://www.w3schools.com/js/js_popup.asp");
			driver.manage ().window().maximize();
			Thread.sleep(3000);
			

			WebElement AlertBox = driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself')])[1]"));
			WebElement ConfirmBox = driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself')])[2]"));
			WebElement PromptBox = driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself')])[3]"));
			WebElement LinkBreak = driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself')])[4]"));
	
	//		WebElement AlertBox = driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/a"));
	//		WebElement ConfirmBox = driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/a"));
	//		WebElement PromptBox = driver.findElement(By.xpath("//*[@id=\"main\"]/div[9]/a"));
	//		WebElement LinkBreak = driver.findElement(By.xpath("//*[@id=\"main\"]/div[10]/a"));
			
			AlertBox.click();
			Thread.sleep(20000);
			ConfirmBox.click();
			Thread.sleep(20000);
			PromptBox.click();
			Thread.sleep(20000);
	    	LinkBreak.click();
			Thread.sleep(20000);
			
			String addr= driver.getWindowHandle();   //main window
			System.out.println("Address of main window" + addr);
			
			ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());  //All tabs Address
		
			for(int i=0; i<address.size(); i++)
			{
	
				String addr1= address.get(i);
				Thread.sleep(20000);
				driver.switchTo().window(addr1);
		
			   String url= driver.getCurrentUrl();
			   System.out.println(addr1 +": " + url);
			 
			   
			}
			
			
			   
			   
//			   String addr0= address.get(0);
//				Thread.sleep(20000);
	//			String addr1= address.get(1);
	//			Thread.sleep(20000);
//				String addr2= address.get(2);
//				Thread.sleep(20000);
//				String addr3= address.get(3);
//				Thread.sleep(20000);
//				String addr4= address.get(4);
//				Thread.sleep(20000);
			
//				 driver.switchTo().window(addr0);
//				   driver.switchTo().window(addr1);
//				   driver.switchTo().window(addr2);
//				   driver.switchTo().window(addr3);
//				   driver.switchTo().window(addr4);
				   
//				   System.out.println(addr0 +": " + url);
//				   System.out.println(addr1 +": " + url);
//				   System.out.println(addr2 +": " + url);
	//			   System.out.println(addr3 +": " + url);
//				   System.out.println(addr4 +": " + url);
			
	}
}
