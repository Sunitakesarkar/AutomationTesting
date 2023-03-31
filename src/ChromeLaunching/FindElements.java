package ChromeLaunching;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 

{
	static WebDriver driver;
	public static void fetchCompanyDetails(String companyName1)
	{
		List<WebElement> a= driver.findElements(By.xpath("//td[text()='"+companyName1 +"']/parent::tr//td" ));
	   
	
	}
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
	        
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage ().window().maximize();
			Thread.sleep(3000);
			
	//		List<WebElement> tableData =driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		//	int numberOfWebElement = tableData.size();
		//	System.out.println(numberOfWebElement);
			
	//		for(int i=0; i<numberOfWebElement; i++)
		//	{
			//	WebElement a1 =tableData.get(i);
			//	System.out.println(a1.getText());
	//		}
		
			
			List<WebElement> tryData =driver.findElements(By.xpath("//*[contains(text(),'Try it Yourself')]"));
			int numberOfWebElement = tryData.size();
			System.out.println(numberOfWebElement);
			
			for(int i=0; i<numberOfWebElement; i++)
			{
				WebElement a1 =tryData.get(i);
				System.out.println(a1.getText());
				fetchCompanyDetails("companyName1");
			}
}
}