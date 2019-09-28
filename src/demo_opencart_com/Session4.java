package demo_opencart_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session4 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com");
		
		String SearchText = "//input[@id='search_query_top']";

		String SearchButton= "//button[@name='submit_search']";
		
		String ClickonProductImage= "//div[@class='product-image-container']";
		
		String VerifyProductandPrice= "//div[@id='pagination']/following-sibling::div";
		
		String ChangeQuantity= "//input[@id='quantity_wanted']";
		
		String ChangeSize= "//select[@id='group_1']";
		
		String ChangeColor= "//a[@id='color_14']";
		
		String AddtoCart= "//button[@name='Submit']";
		
		String ProceedtoCheckout= "//a[@title='Proceed to checkout']";
		
		String ChangeQty = "(//input[starts-with(@name,'quantity')])[2]";
		
		String VerifyPriceChange = "//span[@id='total_price']";
		
		String ClickP_to_Checkout = "(//a[starts-with(@title,'Proceed to checkout')])[2]";
		
		String ViewmyCart = "//a[@title='View my shopping cart']";
		
		String Delete_Cart= "//a[@title='remove this product from my cart' and @class='ajax_cart_block_remove_link']";
		
		String Verify_Cart_is_empty= "//a[@title='View my shopping cart']";
		
		
		driver.findElement(By.xpath(SearchText)).sendKeys("shirt");
		
		driver.findElement(By.xpath(SearchButton)).click();
		
		String item= driver.findElement(By.xpath(VerifyProductandPrice)).getText();
		
		System.out.println(item);
		
		
		
		driver.findElement(By.xpath(ClickonProductImage)).click();
		
		driver.findElement(By.xpath(ChangeQuantity)).clear();
		
		driver.findElement(By.xpath(ChangeQuantity)).sendKeys("4");
		
        new Select(driver.findElement(By.xpath(ChangeSize))).selectByVisibleText("L");
        
        driver.findElement(By.xpath(ChangeColor)).click();
        
        driver.findElement(By.xpath(AddtoCart)).click();
        
        WebElement w1= driver.findElement(By.xpath(ProceedtoCheckout));
        
        WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(w1));
		
		Thread.sleep(3000);
        
        driver.findElement(By.xpath(ProceedtoCheckout)).click();
        
        driver.findElement(By.xpath(ChangeQty)).clear();
        
        
        driver.findElement(By.xpath(ChangeQty)).sendKeys("7");
        
        Thread.sleep(3000);
       
        String VPC = driver.findElement(By.xpath(VerifyPriceChange)).getText();
        
        System.out.println(VPC);
        
        driver.findElement(By.xpath(ClickP_to_Checkout)).click();
        
        
       
        Actions action = new Actions(driver);
        
        action.moveToElement(driver.findElement(By.xpath(ViewmyCart))).build().perform();
        
        
        
       // driver.findElement(By.xpath(ViewmyCart)).click();
        
        Thread.sleep(4000);
        
        
        driver.findElement(By.xpath(Delete_Cart)).click();
        
        
        
		
		
	}

}
