package demo_opencart_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session3 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com");
		
		String dressesButton = "//div[@id='block_top_menu']/ul/li[2]/a";
		
		String summerdressesButton = "//a[@title='Summer Dresses'and @class='img']";
		
		String ClickprintedsummerdressImage = "//ul[@class='product_list grid row']/li[1]";
		
		String Verifyingproductmodelnumber = "//p[@id='product_reference']";
		
		String Verifyingproductprice = "//span[@id='our_price_display']";
		
		String ChangeQuantity = "//p[@id='quantity_wanted_p']";

		String ChangeSize = "//select[@id='group_1']";
		
		String ChangeColor = "//a[@id='color_13']";
		
		String ClickAddtoCart = "//p[@id='add_to_cart']";
		
		String ClickProceedtoCheckout= "//a[@title='Proceed to checkout']";
				
				
		driver.findElement(By.xpath(dressesButton)).click();
		
		driver.findElement(By.xpath(summerdressesButton)).click();
		
		driver.findElement(By.xpath(ClickprintedsummerdressImage)).click();
		
		String VfyModelNbr = driver.findElement(By.xpath(Verifyingproductmodelnumber)).getText();
		
		System.out.println(VfyModelNbr);
		
		String VfyPPrice = driver.findElement(By.xpath(Verifyingproductprice)).getText();
		
		System.out.println(VfyPPrice);
		
		
	}

}
