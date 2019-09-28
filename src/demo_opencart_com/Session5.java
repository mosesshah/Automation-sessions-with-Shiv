package demo_opencart_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Session5 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");

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
		
		
		
		
		
		
		
		driver.findElement(By.xpath(Click_Menu_Desktop)).click();
		
		driver.findElement(By.xpath(Click_On_Mac)).click();
		
		driver.findElement(By.xpath(Click_On_Image)).click();
		
		String title = driver.findElement(By.xpath(Get_Title)).getText();
		
		System.out.println(title);
		
		String Brand_Info = driver.findElement(By.xpath(Get_Brand_Info)).getText();
		
		System.out.println(Brand_Info);
		
		String Product_Code = driver.findElement(By.xpath(Get_Product_Code)).getText();
		
		System.out.println(Product_Code);
		
		String Product_Availability = driver.findElement(By.xpath(Get_Product_Availability)).getText();
		
		System.out.println(Product_Availability);
		
		String Verify_Price = driver.findElement(By.xpath(Get_Price)).getText();
		
		System.out.println(Verify_Price);
		
		driver.findElement(By.xpath(Change_Quantity)).clear();
		
		driver.findElement(By.xpath(Change_Quantity)).sendKeys("5");
		
		driver.findElement(By.xpath(Add_to_Cart)).click();
		
		driver.findElement(By.xpath(Click_on_Added_Items)).click();
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath(Remove_Quantity)).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(Click_on_Checkout)).click();
		
		driver.findElement(By.xpath(Change_Qty_On_Checkout)).clear();
		
		driver.findElement(By.xpath(Change_Qty_On_Checkout)).sendKeys("2");
		
		driver.findElement(By.xpath(Click_on_Refresh)).click();
		
		
	}

}
