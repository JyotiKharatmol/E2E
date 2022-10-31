package Academy;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;



public class AppTest extends base {
	WebDriver driver;

public Logger log = LogManager.getLogger(AppTest.class.getName());



	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver= initializeBrowser();
		log.info("chrome browser initialized");
		driver.get(po.getProperty("url"));
	}
	
	
	@Test
	
	public void VerifyFirstFeaturedCourse()
	{
		LandingPage l = new LandingPage(driver);
		l.PopupImageClose().click();
		Assert.assertEquals("Selenium Webdriver with Java Basics + Advanced + Interview Guide",l.FirstFeaturedCourse().getText());
	
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
