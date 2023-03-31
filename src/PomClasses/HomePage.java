package PomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	WebDriverWait wait;
	
 @FindBy(xpath="(//*[text()='Admin'])[1]")  
 private WebElement admin;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]")
 private WebElement usrManagement;
 
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
 private WebElement usrNameBox;

 //"(//input[@class='oxd-input oxd-input--active'])[2]"
 
 @FindBy(xpath="(//*[text()='-- Select --'])[1]")
 private WebElement UserRole;
 
 @FindBy(xpath="//input[@placeholder='Type for hints...']")
 private WebElement Employeenm;
 
 @FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
 private WebElement pim;
 
 @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
 private WebElement EmpID;
 
 @FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")
 private WebElement Leave;
 
 @FindBy(xpath="(//span[@class='oxd-chip oxd-chip--default oxd-multiselect-chips-selected'])[2]")
 private WebElement LeaveStatus;
 
 
 public HomePage(WebDriver driver) 
 {
	    this.driver=driver;
    	PageFactory.initElements(driver, this);
	   wait= new WebDriverWait(driver, Duration.ofSeconds(20));
 }
 
 public void MoveToEleAdmin(WebDriver driver)
 {   Actions act= new Actions(driver);
	 act.moveToElement(admin).perform();
 }
 
 
 public void ClickOnAdmin() 
	{
	 admin.click();
	}
 
 public void usrmanagementDisplay() 
	{
	 boolean result = usrManagement.isDisplayed();
	 System.out.println(result);
	}
 
 public void VerifyUsrNamebox(String name) throws InterruptedException 
	{
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
	 usrNameBox.sendKeys(name);
	 Thread.sleep(5000);
	}
 
 public void verifyUsrRole(String role) throws InterruptedException
	{
	 UserRole.click();
	 UserRole.sendKeys(role);
	 Thread.sleep(5000);

	}
 
 public void VerifyEmployeeName(String nm) throws InterruptedException
	{
	 
	 Actions act= new Actions(driver);
	 act.moveToElement(Employeenm).perform();
	 Employeenm.click();
	 Employeenm.sendKeys(nm);
	 Thread.sleep(5000);
	}
 
 public void VerifyPIM() throws InterruptedException
	{
	 
	 Actions act= new Actions(driver);
	 act.moveToElement(pim).perform();
	 pim.click();
	 
	 Thread.sleep(5000);
	}
 
 public void VerifyEmpID(String empID) throws InterruptedException
	{
	 Actions act= new Actions(driver);
	 act.moveToElement(EmpID).perform();
	 EmpID.sendKeys(empID);
	 Thread.sleep(5000);
	}
 
 public void VerifyLEAVE() throws InterruptedException
	{
	 
	 Actions act= new Actions(driver);
	 act.moveToElement(Leave).perform();
	 Leave.click();
	 act.moveToElement(LeaveStatus).perform();
	 LeaveStatus.click();
	 Thread.sleep(5000);
	}
 
 
 
}

