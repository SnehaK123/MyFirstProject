package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCaseClass
{	
	
@Test

public void verifyLogin()
{
	try {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sneha\\Desktop\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		LoginElements login = new LoginElements(driver);
		login.userele("edureka");
		login.passele("edureka123");
		login.loginele();
		Thread.sleep(2000);
		driver.quit();
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
}


}
