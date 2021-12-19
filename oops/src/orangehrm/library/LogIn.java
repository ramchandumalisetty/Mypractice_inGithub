package orangehrm.library;

import org.openqa.selenium.By;

import Utils.Driveropen;

public class LogIn extends Driveropen
{
	public static void Adminlogin(String uid, String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	public static void Logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	public  void loginWithinvalid(String uid1, String pwd1)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid1);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd1);
		driver.findElement(By.id("btnLogin")).click();
		String msg = driver.findElement(By.id("spanMessage")).getText();
		if(msg.toLowerCase().contains("invalid"))
		{
			System.out.println("showing error msg As invalid data, test pass");
		}
		else
		{
			System.out.println("Does not showing error msg As invalid data, test fail");
		}
		
	}

}
