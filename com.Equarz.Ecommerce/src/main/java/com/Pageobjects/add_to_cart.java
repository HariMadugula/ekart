package com.Pageobjects;



	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.Testbase;


	public class add_to_cart  extends Testbase {
		
		@FindBy(xpath="//span[text()='TVs & Appliances']")//categories
		WebElement cat;
		@FindBy(xpath="//span[text()='Microwave oven']")
		WebElement subcat;
		@FindBy(xpath="//a[text()='Premium']")
		WebElement subsub;
		@FindBy(xpath="//a[@href='http://e-quarz.com/product/panasonic-20l-solo-microwave-oven-nn-st26jmfdg-silver-51-auto-menus-C81NSM']")
	    WebElement product;
		@FindBy(xpath="//span[text()='Add to cart']")
		WebElement addtocart;
		@FindBy(xpath="//div[text()='Successfully added!']")
		WebElement successful;
		
		@FindBy(xpath="//button[@class='buy_btn']")//deals
		WebElement buynow;
		
		@FindBy(xpath="//a[@href='http://e-quarz.com/product/avro-furniture-set-of-2-plastic-chairs-matt-and-gloss-pattern-plastic-chairs-for-home-living-room-bearing-capacity-up-to'][1]")
		WebElement prod;       //home
		
		@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
		WebElement search;  //search
		@FindBy(xpath="//button[@class='input-group-append-overlay search_button']")
		WebElement searchbtn;
		@FindBy(xpath="//a[@href='http://e-quarz.com/product/hp-247-g8-laptop-amd-athlon-p-3045b-hd-14-inches355cm-hd-8gb-ram-ddr4-1tb-hddwindows-11-home-w11-sl-one-year-warranty-bl']")
		WebElement pro;
		@FindBy(xpath="//img[@class='d-block w-100 __slide-img']")      //banner
		WebElement ban;
		@FindBy(xpath="//a[@href='http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX']")
		WebElement banprod;
		
		
		public add_to_cart (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void  categorylist() throws InterruptedException
		{
			
			Actions ac=new Actions(driver);
			ac.moveToElement(cat).build().perform();
			Thread.sleep(3000);
			ac.moveToElement(subcat).build().perform();
			subsub.click();				
			product.click();
			addtocart.click();		
			
			
		}
		public void dealslist()
		{
			buynow.click();
			addtocart.click();
			String print=successful.getText();
			assertEquals("Successfully added!",print);
		}
		public void homelist()
		{
			prod.click();
			addtocart.click();
			String print=successful.getText();
			assertEquals("Successfully added!",print);
		}
		public void searchlist()
		{
			search.sendKeys(props.getProperty("product"));
			searchbtn.click();
			pro.click();
			addtocart.click();
			String print=successful.getText();
			assertEquals("Successfully added!",print);
		}
		public void bannerlist()
		{
			ban.click();
			banprod.click();
			addtocart.click();
			String print=successful.getText();
			assertEquals("Successfully added!",print);
		}
		
		

	}



