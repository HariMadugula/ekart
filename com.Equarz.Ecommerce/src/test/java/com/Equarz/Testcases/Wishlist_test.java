package com.Equarz.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Wishlist_functionality;
import com.base.Testbase;

public class Wishlist_test  extends Testbase{

		
	Wishlist_functionality wl;
		Login_Functionality lg;
		
		public Wishlist_test() {
			super();
		}
		
		@BeforeMethod
		public void initialize() throws Throwable {
			
			Setup();
			lg= new Login_Functionality(driver);
			lg.Verifylogin();
			//lg.validateLogin(props.getProperty("username"),props.getProperty("password"));
			 wl = new Wishlist_functionality(driver);
		}
		@Test
		public void categorywishlist() 
		{
			wl.categorylist();
		}
		@Test
		public void bannerwishlist() 
		{
			wl.bannerlist();
		}
		@Test
		public void searchwishlist() 
		{
			wl.searchlist();
		}
		@Test
		public void homewishlist()
		{
			wl.homelist();
		}

}



