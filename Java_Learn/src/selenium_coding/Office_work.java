package selenium_coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Office_work {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admodi.ORADEV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://prdcfms.apcfss.in:44300/sap/bc/ui5_ui5/sap/zexp_bnf_search/index.html?sap-client=350&sap-ui-theme=cfms@https://prdcfms.apcfss.in:44300/sap/public/bc/themes/~client-350");
		System.out.println(driver.getTitle());


	}

}
