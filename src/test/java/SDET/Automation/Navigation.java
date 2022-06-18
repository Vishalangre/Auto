package SDET.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.snapdeal.com/");
		
//		driver.get("https://www.snapdeal.com/");
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_5ikydyrck9_b&adgrpid=58972567855&hvpone=&hvptwo=&hvadid=294134771434&hvpos=&hvnetw=g&hvrand=12216119056053135188&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301021&hvtargid=kwd-513872812020&hydadcr=5839_1738693&gclid=CjwKCAjwy_aUBhACEiwA2IHHQN7uBfElSi2byDOtu1tQ-UsuP1jVgfa-7lWkO3DUUe30Cs2vx_fbuRoCDk0QAvD_BwE");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
//		driver.close();

	}

}
