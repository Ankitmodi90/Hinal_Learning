package selenium_coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.get("https://learn.letskodeit.com/p/practice");
			
			String current = driver.getWindowHandle();

			driver.findElement(By.id("openwindow")).click();
			
			Set<String> allWindows = driver.getWindowHandles();
			List<String> l1=new ArrayList<String>(allWindows);
			System.out.println(allWindows);
			for(String s : l1)
			{
				if(s!= current)
				{
					driver.switchTo().window(s);
				}
			}
			Thread.sleep(3000);
			driver.findElement(By.id("search-courses")).sendKeys("hinal");
			driver.close();
			driver.switchTo().window(current);
			
			System.out.println(current);
			driver.findElement(By.linkText("Open Tab")).click();
			driver.findElement(By.linkText("Open Tab")).sendKeys(Keys.CONTROL + "2");
    Set<String> Allwind = driver.getWindowHandles();
			System.out.println("tab:  "+Allwind);
			for(String s:Allwind)
			{
				if(s!= current)
				{
					driver.switchTo().window(s);
				}
			}
			Thread.sleep(5000);
			driver.findElement(By.id("search-courses")).sendKeys("hinal");
			driver.close();
			driver.switchTo().window(current);
		} catch (Exception e) {
			System.out.println("Failed");
		}
		
		finally {
			driver.quit();
		}
		
		

	}

}
