package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	WebDriver driver;
	
	ForgotPasswordPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css="input[name='email']")
	WebElement emailID;
	
	@FindBy(css="input[type='submit']")
	WebElement sendMeInstruction;
	
	public WebElement EmailId()
	{
		return emailID;
	}
	public WebElement SendMeInstruction()
	{
		return sendMeInstruction;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
