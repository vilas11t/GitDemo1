package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userId = By.id("login1");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@name='proceed']");

	public WebElement getUserId()
        {
		  return driver.findElement(userId);
        }
	
	 public WebElement getPassword()
    {
	  return driver.findElement(password);
    }
	
	 public WebElement getLogin()
     {
		  return driver.findElement(login);
     }
}
