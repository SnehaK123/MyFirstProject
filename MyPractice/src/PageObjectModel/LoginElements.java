package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.testng.annotations.Test;

public class LoginElements {
 WebDriver driver;
 By username = By.name("userName");
 By password= By.name("password");
 By login= By.name("login");
 
 public LoginElements(WebDriver driver1)
 {
	 this.driver = driver1;
 }
 public void userele(String uid) 
 {
    driver.findElement(username).sendKeys(uid);	 
  }
 public void passele(String upwd)
 {
	 driver.findElement(password).sendKeys(upwd);
 }
 public void loginele()
 {
	 driver.findElement(login).click();
 }
}
