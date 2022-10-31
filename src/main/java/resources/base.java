package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver; 
	
	public Properties po;
	
public WebDriver initializeBrowser() throws IOException
{
	//chrome
	//firefox
	//edge
	
	FileInputStream fis = new FileInputStream("C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Desktop\\E2E\\src\\main\\java\\resources\\data.properties");
	 po = new Properties();
	po.load(fis);
	
	String browserName = po.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
	}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\GeckoDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
	}
	else if(browserName.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
}
	public void getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
	File source = 	ts.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	
		FileUtils.copyFile(source, new File(destination));
		
	}
	
	
	
	
	
	
	
}
