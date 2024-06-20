package SeleniumXpathPackage;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadingStrategiesNormalEagerNone {

	public static void main(String[] args) throws InterruptedException {
		// NORMAL
		
		ChromeOptions option = new ChromeOptions();
		
		
	//	option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	//	option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		option.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.quit();
		
		//Thread.sleep(1000);
		
		
		
		

	}

}
