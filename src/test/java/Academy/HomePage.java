package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	WebDriver driver;

	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
	}
	
	
	@Test(dataProvider= "getData")
	
	public void home(String Username, String Password, String text) throws IOException
	{
		
		driver.get("https://qaclickacademy.com");	
		LandingPage l = new LandingPage(driver);
		l.PopupImageClose().click();
		LoginPage lp=l.SignIn();
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin();
		System.out.println(text);
	}

	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0]= "restricteduser@academy.com";
		data[0][1]= "12345";
		data[0][2] = "Restricted User";
		
		data[1][0]= "non-restricteduser@academy.com";
		data[1][1]= "67890";
		data[1][2] = "Non-restricted User";
		
	//Array size = 2
		//0,1
		//Array size = 3
		//0,1,2
		
		return data;
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}

	
	
	
	
	
	
	
}
