/*
 * This is test is test an test
 * 
 */
package co.practice.selenium.webdriver.basic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverService;

public class FirstClass {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser()
	
	{
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sneha\\Desktop\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			driver.get("http://www.edureka.co");
			searchCourse();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void searchCourse()
	
	{
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("JAVA");
			Thread.sleep(4000);
			driver.findElement(By.className("active")).click();
			Thread.sleep(4000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 800)");
			//driver.findElement(By.className("typeahead-list")).click();
			//driver.findElement(By.id("search-button-top")).click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		FirstClass myObj = new FirstClass();
		myObj.invokeBrowser();
	}

}
