package SDET.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input_Box {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        
		SearchBox.sendKeys("Vishal");
		SearchBox.clear();
		Thread.sleep(1000);
		SearchBox.sendKeys("Hitesh");
		System.out.println(SearchBox.getAttribute("value"));
	}

}
