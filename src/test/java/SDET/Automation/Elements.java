package SDET.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		
		System.out.println(SearchBox.getText());
		
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='middleTop row']//a"));
        
		System.out.println("Number of elements: "+links.size());
		
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
		
//		driver.findElement(By.xpath("//img[@class='notIeLogoHeader aspectRatioEqual sdHomepage cur-pointer']"));
	
	    
	}

}
