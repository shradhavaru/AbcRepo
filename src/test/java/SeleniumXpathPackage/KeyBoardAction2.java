package SeleniumXpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriver driver = new ChromeDriver();
		
		/*
		driver.get("https://www.google.com/");
		Actions actions = new Actions(driver);
		WebElement searchBox = driver.findElement(By.name("q"));
		Thread.sleep(2000);

		
		actions.keyDown(Keys.SHIFT).sendKeys(searchBox, "SelenIUM").perform();   //keyDown  -SELENIUM
       //Thread.sleep(2000);
		
	   //actions.keyUp(Keys.SHIFT).sendKeys(searchBox, "autoMATION").perform();    //keyUp - autoMATION
		
		*/
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
