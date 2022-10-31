package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ForgotPassword extends base {

	@BeforeTest
	
	public void intialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(po.getProperty("url"));
	
	}
	@Test
	public void ForgotPassword()
	{
		LandingPage l = new LandingPage(driver);
		l.PopupImageClose().click();
		LoginPage lp=l.SignIn();
		lp.getEmail().sendKeys("abhc");
		lp.getPassword().sendKeys("1234");
		
		ForgotPasswordPage f= lp.getLogin();
		f.EmailId().sendKeys("abc@xyz.com");
		f.SendMeInstruction().click();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}
	
	
	
	
	
}
