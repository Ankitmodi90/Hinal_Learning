package selenium_coding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("hinal"); 
		driver.findElement(By.xpath("//input[@value='Alert' and @ type='submit']")).click();
		Alert alert = driver.switchTo().alert();
		String s = alert.getText();
		System.out.println("Alert get text = "+s);
		Thread.sleep(3000);
		alert.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("hinal"); 
		driver.findElement(By.xpath("//input[@value='Confirm' and @ type='submit']")).click();
		Alert alert1 = driver.switchTo().alert();
		String s1 = alert1.getText();
		System.out.println("confirm get text = "+s1);
		Thread.sleep(3000);
		alert1.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("hinal"); 
		driver.findElement(By.xpath("//input[@value='Confirm' and @ type='submit']")).click();
		Alert alert2 = driver.switchTo().alert();
		String s2 = alert2.getText();
		System.out.println("confirm get text = "+s2);
		Thread.sleep(3000);
		alert2.dismiss();
		
		

	}

}
