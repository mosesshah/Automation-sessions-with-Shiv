package demo_opencart_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session1 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("http://demo.opencart.com");

		/*String Title = driver.getTitle();

		System.out.println("Title is " + driver.getTitle());

		if(Title.equals("Your Store")) {

			System.out.println("Pass");
		}
		else

		{
			System.out.println("Fail");
		}
		*/

		driver.findElement(By.name("search")).sendKeys("phone");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

		Select drpdown = new Select(driver.findElement(By.name("category_id")));
		
		drpdown.selectByVisibleText("Tablets");
		
		driver.findElement(By.xpath("//select[@name='category_id']")).click();
		
		driver.findElement(By.xpath("//img[@class='img-responsive']")).click();

		driver.close();
		
		driver.quit();

	}

}
