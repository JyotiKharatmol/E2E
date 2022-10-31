package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
			
	this.driver=driver;	
		
	}
	
	By popupImageClose = By.cssSelector("div[class*='popup-image']");
	
	By title = By.cssSelector("section[id='content'] div.container div.text-center");
	
	By signIn = By.cssSelector("a[href*='sign_in']");
	
	By navigationMenu = By.cssSelector("nav.navbar-collapse.collapse ul");
	
	By homeMenu = By.cssSelector("nav.navbar-collapse.collapse ul li:nth-child(1)");
	
	By fistFeaturedCourse = By.xpath("//ul/li[1]/div[@class='item']/h3");
	

	public WebElement PopupImageClose()
	{
		return driver.findElement(popupImageClose);
	}
	
	public WebElement NavigationMenu()
	{
		return driver.findElement(navigationMenu);
	}
	
	public WebElement HomeMenu()
	{
		return driver.findElement(homeMenu);
	}

	public LoginPage SignIn()
	{
		driver.findElement(signIn).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	}
	
	public WebElement Title()
	{
		return driver.findElement(title);
	}
	
	public WebElement FirstFeaturedCourse()
	{
		return driver.findElement(fistFeaturedCourse);
	}
	
	
	
	
	
}
