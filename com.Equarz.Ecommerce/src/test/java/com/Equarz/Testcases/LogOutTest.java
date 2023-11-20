package com.Equarz.Testcases;



	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.LogOut_Functionality;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

	public class LogOutTest extends Testbase {
		LogOut_Functionality lf;
		Login_Functionality lg;
		
		
		public LogOutTest ()
		{
			super();
		}
		
		@BeforeMethod
		public void initialize() throws Throwable 
		{
			
			Setup();
			lg=new Login_Functionality(driver);
			lg.Verifylogin();
			lf=new LogOut_Functionality (driver);		
					
		}
		@Test()
		public void logout() throws Throwable
		{
			lf.logout();
			
		}
		@Test()
		public void refresh() throws Throwable
		{
			lf.refresh();
			
		}
		@Test()
		public void back() throws Throwable
		{
			lf.back();
			
		}



	}


