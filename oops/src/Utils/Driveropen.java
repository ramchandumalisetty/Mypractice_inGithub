package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driveropen 
{
	 public static WebDriver driver; 
	static String url= "http://orangehrm.qedgetech.com";
	public static void webdriverOpen()
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);		
	}
	
	
	public static void close()
	{
		driver.close();
	}

}
