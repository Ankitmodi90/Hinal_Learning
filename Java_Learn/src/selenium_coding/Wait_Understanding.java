package selenium_coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait_Understanding {
	
	static WebDriver driver ;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try {
			driver.get("https://www.google.co.in");
			
			driver.findElement(By.xpath("//a[text()='Gmail']")).click();
			
			driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("Ankitflame@gmail.com");
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Gmail']"))));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			driver.quit();
		}
		
	}

}
