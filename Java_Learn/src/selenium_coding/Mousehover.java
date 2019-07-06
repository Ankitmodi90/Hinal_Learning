package selenium_coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Mousehover {

	static WebDriver driver = null;

	public static void main(String[] args) {

		
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			driver.get("https://learn.letskodeit.com/p/practice");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Actions act=new Actions(driver);
			WebElement s= 	driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
//			js.executeScript("arguments[0].scrollIntoView();", s);
			js.executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("//input[@id='hide-textbox']")));

//			WebElement eleClick = driver.findElement(By.xpath("//a[text() = 'Top']"));
			WebElement eleClick = driver.findElement(By.linkText("Top"));
			
			act.moveToElement(s)
//			.moveToElement(driver.findElement(By.xpath("//a[text() = 'Top']")))
//			.click()
			.build().perform();
			
			
//			act.moveToElement(s).perform();
			
			
			
		/*	act.moveToElement(eleClick);
			 
	        act.click();
	 
	        act.perform();*/
			
			eleClick.click();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			driver.quit();
		}



	}

}
