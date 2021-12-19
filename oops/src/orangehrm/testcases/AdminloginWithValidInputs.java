package orangehrm.testcases;

import Utils.Driveropen;
import orangehrm.library.LogIn;

public class AdminloginWithValidInputs 
{

	public static void main(String[] args) throws Exception 
	{
		Driveropen.webdriverOpen();
		LogIn.Adminlogin("Admin", "Qedge123!@#");
		Thread.sleep(5000);
		LogIn.Logout();
		Driveropen.close();

	}

}
