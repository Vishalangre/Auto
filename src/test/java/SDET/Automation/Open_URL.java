package SDET.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_URL {

	public static void main(String[] args) {
       
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		System.out.println("Current Page Title is : "+driver.getTitle());
		
		System.out.println("Current URL is : "+driver.getCurrentUrl());
		
		driver.close();

	}

}
