package SDET.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("http://uitestpractice.com/Students/Select");
		
		Select Country2=new Select(driver.findElement(By.xpath("//select[@id='countriesSingle']")));
		
		Country2.selectByVisibleText("China");
		
		
		

	}

}
