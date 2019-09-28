package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Open_Cart {
	
	static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize() ;

		String Click_Menu_Desktop = "//ul[@class='nav navbar-nav']/li[1]/a";
		
		String Click_On_Mac = "//a[contains(text(),'Mac (1)')]";
		
		String Click_On_Image = "//div[@class='image']/a";
		
		String Get_Title = "//div[@id='logo']/h1/a";
		
		String Get_Brand_Info = "//li[contains(text(),'Brand:')]";
		
		String Get_Product_Code = "//li[contains(text(),'Product Code: Product 14')]";
		
		String Get_Product_Availability = "//li[contains(text(),'Availability: Out Of Stock')]";
		
		String Get_Price = "//h2[contains(text(),'$122.00')]";
		
		String Change_Quantity = "//input[@id='input-quantity']";
		
		String Add_to_Cart = "//button[@id='button-cart']";
		
		String Click_on_Added_Items = "//span[@id='cart-total']";
		
		String Remove_Quantity = "//i[@class='fa fa-times']";
		
		String Click_on_Checkout = "//strong[contains(text(),'Checkout')]";
		
		String Change_Qty_On_Checkout = "//input[starts-with(@name,'quantity')]";
		
		String Click_on_Refresh = "//i[@class='fa fa-refresh']";
		
		String Use_Coupon_Code = "//a[contains(text(),'Use Coupon Code')]";
		
		String Enter_Text_In_Use_Coupon_Code = "//input[@id='input-coupon']";
		
		String Click_on_apply_Coupon = "//input[@id='button-coupon']";
		
		String Click_on_Estimate_Shipping_Taxes = "//a[contains(text(),'Estimate Shipping & Taxes')]";
		
		String Select_Country = "//select[@id='input-country']";
		
		String Select_Region = "//select[@id='input-zone']";
		
		String Add_PostCode = "//input[@id='input-postcode']";
		
		String Click_on_Get_Quotes = "//button[@id='button-quote']";
		
		String Click_Radio_Button_Flat_Shipp_Rate = "//label[contains(text(),'Flat Shipping Rate - $8.00')]";//ask shiv about the xpath
		
		String Click_on_Apply_Shipping = "//input[@id='button-shipping']";
		
		
		driver.findElement(By.xpath(Click_Menu_Desktop)).click();
		
		driver.findElement(By.xpath(Click_On_Mac)).click();
		
		driver.findElement(By.xpath(Click_On_Image)).click();
		
		String title = driver.findElement(By.xpath(Get_Title)).getText();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Your Store");
		
		
		String Brand_Info = driver.findElement(By.xpath(Get_Brand_Info)).getText();
		
		System.out.println(Brand_Info);
		
		Assert.assertEquals(Brand_Info, "Brand: Apple");
		
		
		String Product_Code = driver.findElement(By.xpath(Get_Product_Code)).getText();
		
		System.out.println(Product_Code);
		
		Assert.assertEquals(Product_Code, "Product Code: Product 14");
		
		
		String Product_Availability = driver.findElement(By.xpath(Get_Product_Availability)).getText();
		
		System.out.println(Product_Availability);
		
		Assert.assertEquals(Product_Availability, "Availability: Out Of Stock");
		
		
		
		String Verify_Price = driver.findElement(By.xpath(Get_Price)).getText();
		
		System.out.println(Verify_Price);
		
		Assert.assertEquals(Verify_Price, "$122.00");
		
		
		
		driver.findElement(By.xpath(Change_Quantity)).clear();
		
		driver.findElement(By.xpath(Change_Quantity)).sendKeys("5");
		
		String change_quantity = driver.findElement(By.xpath(Change_Quantity)).getAttribute("value");
		
		Assert.assertEquals(change_quantity, "5");
	
		
		driver.findElement(By.xpath(Add_to_Cart)).click();
		
		driver.findElement(By.xpath(Click_on_Added_Items)).click();
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath(Remove_Quantity)).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(Click_on_Checkout)).click();
		
		driver.findElement(By.xpath(Change_Qty_On_Checkout)).clear();
		
		driver.findElement(By.xpath(Change_Qty_On_Checkout)).sendKeys("2");
		
		String c_q_o_checkout = driver.findElement(By.xpath(Change_Qty_On_Checkout)).getAttribute("value");
		
		Assert.assertEquals(c_q_o_checkout, "2");
		
		driver.findElement(By.xpath(Click_on_Refresh)).click();
		
		driver.findElement(By.xpath(Use_Coupon_Code)).click();
		
		driver.findElement(By.xpath(Enter_Text_In_Use_Coupon_Code)).sendKeys("30%OFF");
		
		driver.findElement(By.xpath(Click_on_apply_Coupon)).click();
		
		driver.findElement(By.xpath(Click_on_Estimate_Shipping_Taxes)).click();
		
		
		
		//Using Select for DropDown Menu
		
		Select drpCountry = new Select(driver.findElement(By.xpath(Select_Country)));
		drpCountry.selectByVisibleText("United Kingdom");
		
		
		Select drpRegion = new Select(driver.findElement(By.xpath(Select_Region)));
		drpRegion.selectByVisibleText("Surrey");
		
		driver.findElement(By.xpath(Add_PostCode)).sendKeys("GU215PZ");

		driver.findElement(By.xpath(Click_on_Get_Quotes)).click();
		
		
		//Explicit Wait
		
		WebDriverWait wait=new WebDriverWait(driver, 30);// Ask shiv about 30
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Click_Radio_Button_Flat_Shipp_Rate)));
			
			
	
		driver.findElement(By.xpath(Click_Radio_Button_Flat_Shipp_Rate)).click();
		
		driver.findElement(By.xpath(Click_on_Apply_Shipping)).click();
	  
	  
  }
}
