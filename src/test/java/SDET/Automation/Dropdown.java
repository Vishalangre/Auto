package SDET.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement Country=driver.findElement(By.id("input-country"));
		
		Select Country2=new Select(Country);
		
//		Country2.selectByIndex(5);
//		Country2.selectByVisibleText("Aruba");
//		Country2.selectByValue("10");
		
		List<WebElement>alloption=Country2.getOptions();
		
		for(WebElement option:alloption)
		{
			if(option.getText().equals("China"));
			{
				option.click();
                break;
			}
		}
		

	}

}
