package ChromeLaunching;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Driver_launch {

	public static void main(String[] args) throws InterruptedException, IOException{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
	
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
		//String url = driver.getCurrentUrl();
		
		//driver.manage ().window().maximize();
		//System.out.println(url);
		
		Thread.sleep(3000);
		
		
		//driver.navigate().to("https://www.selenium.dev/downloads");
		//Thread.sleep(3000);
		
		//driver.navigate().back();
		//Thread.sleep(3000);
	
		//driver.navigate().forward();
		//Thread.sleep(3000);
		
		//driver.navigate().refresh();
		//Thread.sleep(3000);
		
		//String Url = driver.getCurrentUrl();
		//System.out.println(Url);
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		driver.close();
		
		//driver.quit();
	}
}
