package co.practice.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNavigateCommands {
	
	WebDriver driver;
	
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sneha\\Desktop\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			navigateCommands();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void navigateCommands()
	{
		try {
			driver.navigate().to("http://amazon.com");
			driver.findElement(By.linkText("Today's Deals")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		TestNavigateCommands MyObj = new TestNavigateCommands();
		MyObj.invokeBrowser();
	}

}
