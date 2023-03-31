package PomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Loginpage {
	WebDriver driver;
	WebDriverWait wait;
//	WebDriverWait wait;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement logInButton;
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	//	new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void sendUsername(String Uname) 
	{
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		username.sendKeys(Uname);
	}
	
	public void sendPassword(String paswrd)
	{
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys(paswrd);
	}
	
	public void ClickOnLoginButton()
	{
		logInButton.click();
	}

}
