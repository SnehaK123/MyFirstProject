package co.practice.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGetCommands {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sneha\\Desktop\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//page synchronization
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			getCommands();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void getCommands() {
		
		try {
			driver.get("http://www.google.com");
			String titleOfThePage = driver.getTitle();
			System.out.println("Title of the page is:"+titleOfThePage);
			driver.findElement(By.linkText("Store")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current URL is:"+currentUrl);
			System.out.println("The current page source is"+driver.getPageSource());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		TestGetCommands MyObj = new TestGetCommands();
		MyObj.invokeBrowser();
		

	}

}
