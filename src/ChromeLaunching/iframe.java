package ChromeLaunching;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws IOException, InterruptedException
	{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
	        
			driver.get("https://www.w3schools.com/js/js_popup.asp");
			driver.manage ().window().maximize();
			Thread.sleep(3000);
			

			WebElement AlertBox = driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself')])[1]"));
	        AlertBox.click();
	        Thread.sleep(3000);
	
	        ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles()); 
	        driver.switchTo().window(address.get(1));
	        
	        driver.switchTo().frame("iframeResult");
	        Thread.sleep(3000);
	        
	        WebElement TryButton = driver.findElement(By.xpath("//button[text()='Try it']"));
	        TryButton.click();
	        Thread.sleep(3000);
	        
	        Alert alt=driver.switchTo().alert();
	        Thread.sleep(3000);
	        String text=alt.getText();
	        
	    	alt.accept();
	    	System.out.println(text);
	    	Thread.sleep(3000);
	    	
	    //	 driver.switchTo().parentFrame(); 
	    	 driver.switchTo().defaultContent(); 
	    	 WebElement Run = driver.findElement(By.xpath("//button[@id='runbtn']"));
	    	 Run.click();
	    	 Thread.sleep(3000);
	         
	    	 driver.close();
	}
}
