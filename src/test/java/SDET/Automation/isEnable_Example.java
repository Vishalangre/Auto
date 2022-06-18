package SDET.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isEnable_Example {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://frontend.nopcommerce.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement SearchBox=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
       
		SearchBox.sendKeys("Vishal");
//		System.out.println(SearchBox.isDisplayed());
//		
//		System.out.println(SearchBox.isEnabled());
//		
		driver.close();
	}

}
