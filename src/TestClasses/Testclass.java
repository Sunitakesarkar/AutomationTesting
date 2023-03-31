package TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.HomePage;
import PomClasses.Loginpage;

public class Testclass 
{
	public static void main(String[] args) throws InterruptedException, IOException{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		 Loginpage login = new Loginpage(driver);
		 login.sendUsername("Admin");
		 login.sendPassword("admin123");
		 
		 login.ClickOnLoginButton();
		 
		 
		 
		 HomePage Home = new HomePage(driver);
		          Home.MoveToEleAdmin(driver);
		         
		          Home.ClickOnAdmin();
		          
		          Home.usrmanagementDisplay();
		          
		          Home.VerifyUsrNamebox("Abc Def Ghi");
		    
		          Home. verifyUsrRole("Admin");
		    
		          Home.VerifyEmployeeName("Paul  Collings");
		          
		          Home.VerifyPIM();
		          
		          Home.VerifyEmpID("EMP101");
		          
		          Home.VerifyLEAVE();
	}
		 

}