package demotest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import resources.BaseClass;

public class AssertTest extends BaseClass {

	
	@Test
	public void checkAssert() throws IOException
	{
		driver=browserSelect();
		driver.get(pr.getProperty("url"));
		
		HomePage pg=new HomePage(driver);
		Assert.assertEquals(pg.getnewsTitle().getText(), "TOP STORIES");
		Assert.assertTrue(pg.getshoppingLink().isDisplayed());
			 
		
	}
}
