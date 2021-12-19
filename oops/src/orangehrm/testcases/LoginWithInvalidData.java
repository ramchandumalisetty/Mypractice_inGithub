package orangehrm.testcases;

import Utils.Driveropen;
import orangehrm.library.LogIn;

public class LoginWithInvalidData 
{

	public static void main(String[] args)
    {
		Driveropen.webdriverOpen();
		LogIn ln=new LogIn();
		ln.loginWithinvalid("dsads", "zccxvxcvcz");
		
		Driveropen.close();

	}

}
