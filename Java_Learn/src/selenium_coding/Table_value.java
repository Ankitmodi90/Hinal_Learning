package selenium_coding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
/*//		driver.
		"//table[@name='courses' ]//td[text()='Python Programming Language']//precedding"*/

//		System.out.println(driver.findElement(By.xpath("//table[@name='courses' ]//tr[4]")).getText());
//		System.out.println(driver.findElement(By.xpath("//table[@name='courses' ]//tr[contains(.,'JavaScript Programming Language')]")).getText());
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
//		driver.findElement(By.xpath("//input[@id='show-textbox']"));
		System.out.println(driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed());
	String s=	driver.findElement(By.xpath("//input[@id='displayed-text']")).getAttribute("style");
	if(s.equalsIgnoreCase("display: none;"))
	{
		System.out.println("box hide");
		
	}
	else
	{
		System.out.println("text box is not hide");
	}
		
	driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
	 s=	driver.findElement(By.xpath("//input[@id='displayed-text']")).getAttribute("style");
		if(s.equalsIgnoreCase("display: block;"))
		{
			
			driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("hinal");
		}
		
	System.out.println(	"Hinal is lovely "+driver.findElement(By.xpath("//input[@id='displayed-text']")).getText());
	System.out.println(	"Hinal is lovely "+driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed());
	System.out.println(	"Hinal is lovely "+driver.findElement(By.xpath("//input[@id='displayed-text']")).isEnabled());
	
		driver.quit();
		
	}

}
