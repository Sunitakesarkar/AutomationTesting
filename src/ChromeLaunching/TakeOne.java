package ChromeLaunching;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeOne
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	Dimension d = new Dimension(800,500);
	driver.manage().window().setSize(d);

	
	Point p= new Point(0,400);
	driver.manage().window().setPosition(p);
	
	driver.close();
	driver.quit();

}
}
