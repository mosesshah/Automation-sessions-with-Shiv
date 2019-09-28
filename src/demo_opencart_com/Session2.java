package demo_opencart_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");

		String SearchTextBox = "//input[@name='search']";

		String SearchButton = "//button[@type='button' and @class='btn btn-default btn-lg']";

		String Apple_Item = "//img[@class='img-responsive']";

		String Check_Radio_Button = "//input[@name='option[218]' and @value='6']";


		driver.findElement(By.xpath(SearchTextBox)).sendKeys("Apple");
		driver.findElement(By.xpath(SearchButton)).click();
		driver.findElement(By.xpath(Apple_Item)).click();
		driver.findElement(By.xpath(Check_Radio_Button)).click();




	}

}
