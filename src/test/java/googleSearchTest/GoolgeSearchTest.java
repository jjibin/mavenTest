package googleSearchTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoolgeSearchTest {

	@Test
	public void GSearch(){
	String exePath1 = "E:\\Cognizant\\Selenium Packages\\geckodriver.exe";
	 System.setProperty("webdriver.gecko.driver", exePath1);
		WebDriver driver  = new FirefoxDriver();
		driver.navigate().to("http://google.in");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.quit();
	}

}
