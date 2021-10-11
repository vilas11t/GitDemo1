package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By loginpage = By.xpath("//a[@class='signin']");
	By createAcLink = By.xpath("//p[@id='signin_info'] [1]");
	By shoppingLink = By.xpath("//a[@class='shopicon relative']");
	By newsTitle = By.xpath("//h3[contains(text(),'Top Stories')]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement loginPageLink() {
		return driver.findElement(loginpage);
	}

	public WebElement createAccountLink() {
		return driver.findElement(createAcLink);
	}

	public WebElement getshoppingLink() {
		return driver.findElement(shoppingLink);
	}

	public WebElement getnewsTitle() {
		return driver.findElement(newsTitle);
	}
}
