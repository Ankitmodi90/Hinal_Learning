package selenium_coding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_Browser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://learn.letskodeit.com/p/practice");
//		driver.findElement(By.id("bmwradio")).click();
		driver.findElement(By.xpath("//input[@value = 'benz' and @type = 'radio']")).click();
		driver.findElement(By.xpath("//input[@value = 'benz' and @type = 'checkbox']")).click();
		
		driver.findElement(By.xpath("//select[@id ='carselect']//option[@value='benz']")).click();
//		driver.findElement(By.xpath("//select[@id='carselect' and @value='benz']"));
		//List<WebElement> w1 = driver.findElements(By.name("cars"));
		//WebElement w1 = driver.findElement(By.name("cars"));
//		WebElement w1 = driver.findElement(By.xpath("//select[@name ='cars']"));

		/*if(w1.getText().contains("Honda"))
		{

			//System.out.println(w1.getText());
			Select s1=new Select(w1);
			s1.selectByVisibleText("Honda");
		}
		
		else {
			System.out.println("Element does not exist");
		}*/
		
		
		/*Select s1=new Select(w1);
		System.out.println(s1.getFirstSelectedOption().getText());*/
		
/*WebElement w2=driver.findElement(By.id("multiple-select-example"));
System.out.println(w2.getText());
Select s2=new Select(w2);
s2.selectByValue("orange");
s2.selectByValue("peach");*/
		
		
		
//		driver.quit();
	}
}
