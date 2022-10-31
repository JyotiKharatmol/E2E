package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class Title extends base {
	WebDriver driver;
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(po.getProperty("url"));
	}
	
	
	@Test
	
	public void title() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		l.PopupImageClose().click();
		
		Assert.assertEquals(l.Title().getText(), "FEATURE122D COURSES");
		
		Assert.assertTrue(l.NavigationMenu().isDisplayed());		
		
		l.HomeMenu().isDisplayed();
		
		Assert.assertTrue(l.HomeMenu().isDisplayed());
		}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
}
