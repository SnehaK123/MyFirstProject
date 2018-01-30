package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestJenkins {
	
	
	
@Test

public void JenkinsTest()
{
	try {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sneha\\Desktop\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("Success");
		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		String Title = driver.getTitle();
		System.out.println("Page title is" +Title);
		
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.quit();
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
}



	public static void main(String[] args) {
		
		TestJenkins obj = new TestJenkins();
		obj.JenkinsTest();		

	}

}
