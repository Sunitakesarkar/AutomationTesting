package ChromeLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Web_driver {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
	
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		
	//	WebElement loginButton= driver.findElement(By.linkText("Create new account"));  //with the help of text
	//	loginButton.click();
		
		
		
	//	WebElement loginButton= driver.findElement(By.partialLinkText("new account"));  //with the help of partial text
	//	loginButton.click();
		
	//	WebElement loginButton= driver.findElement(By.className("_42ft"));  //with the help of text
	//	loginButton.click();
		
		
		// X path by attribute
	//	WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));  
	//	loginButton.click();
		
		// X path by text
		//		WebElement loginButton= driver.findElement(By.xpath("//button[text()='Log in']"));  //with the help of text
		//		loginButton.click();
		
	//	WebElement userName= driver.findElement(By.id("email"));  //located by id
	//	userName.sendKeys("Velocity.com");
		
	//	Thread.sleep(3000);
		
	//	WebElement password= driver.findElement(By.name("pass"));  //located by name
	//	password.sendKeys("Velocity@1234");
		
	//	Thread.sleep(3000);
		
	//	WebElement loginButton= driver.findElement(By.tagName("button"));  //located by tagName
	//	loginButton.click();
		
	//	Thread.sleep(3000);
		
		WebElement CreateNewAccount= driver.findElement(By.xpath("//*[text() = 'Create new account']"));  //with the help of text
		CreateNewAccount.click();
			
		Thread.sleep(3000);
		
		WebElement Day=  driver.findElement(By.xpath("//select[@id = 'day']"));
		Select s = new Select (Day);
		Thread.sleep(3000);
		s.selectByVisibleText("26");
		Thread.sleep(3000);
		
		 s.selectByValue("27");
		 Thread.sleep(3000);
		 s.selectByIndex(9);
		 Thread.sleep(3000);
		 
		 WebElement month=  driver.findElement(By.xpath("//select[@id = 'month']"));
		 Select s2 = new Select(month);
		 s2.selectByIndex(0);
		 
		 Thread.sleep(3000);
		 s2.selectByIndex(10);
		 Thread.sleep(3000);
		 driver.quit();
		
		
}
}

