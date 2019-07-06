package selenium_coding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouser_Hover_Bottom {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Actions ac= new Actions (driver);
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//input[@id='hide-textbox']")));
		ac.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		
		driver.findElement(By.linkText("Reload")).click();
		driver.quit();
		
		
		
	}

}
