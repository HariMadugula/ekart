package com.Equarz.Testcases;

	import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Registration_Functionality;
import com.Utils.Utils;
import com.base.Testbase;

	public class Signup_test extends Testbase {
		Registration_Functionality reg;
		
		public Signup_test()
		{
			super();
		}
		@BeforeMethod
		public void initialization()
		{
			Setup();
			reg=new Registration_Functionality(driver);
		}
		@Test(priority = 1)
		public void Givenurl() 
		{
			String givenurl = driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/customer/auth/sign-up", givenurl);
		}
		@Test(priority = 2,dataProvider = "setdata",dataProviderClass = Utils.class)
		public void Registration(String first,String last,String emailid,
				String Phonenum,String Password1,String Confirmpassword) throws Throwable
		{
			reg.Regdetails(first, last, emailid, Phonenum, Password1, Confirmpassword);
			
			
		}
		
@AfterMethod
public void shutdown() {
	driver.close();
}
	}

