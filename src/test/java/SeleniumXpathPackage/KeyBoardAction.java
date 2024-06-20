package SeleniumXpathPackage;

import javax.swing.Action;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		/*
		// simulate keyboard typing
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		
		
		//simulate pressing key 
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		Actions action1 = new Actions(driver);
		Action keydown1 = action1.keyDown(Keys.CONTROL).sendKeys("a").build();	//error 
		keydown1.perform();
				

		// release pressed key- KeyUP()

		driver.get("https://www.google.com/");
		Actions actions = new Actions(driver);
		WebElement searchBox = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		//actions.keyUp(Keys.SHIFT).sendKeys(searchBox, "selenium").keyDown(Keys.SHIFT).sendKeys(searchBox, "selenium").perform();  //seleniumSELENIUM
		actions.keyDown(Keys.SHIFT).sendKeys(searchBox, "SElenIUM").keyUp(Keys.SHIFT).sendKeys(searchBox, "SEleniuM").perform();  //SELENIUMselenium
		// output: seleniumSELENIUM  , SELENIUMselenium
		
		*/
		
		/*
		
		// clear()
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).clear();
		
		WebElement ele= driver.findElement(By.name("q"));
		ele.sendKeys("selenium");
		Thread.sleep(2000);
		ele.clear();
		ele.sendKeys("automation");
		Thread.sleep(2000);
		

//		WebElement searchBox1 = driver.findElement(By.name("q")).sendKeys("Selenium"); //error bcos 2 action cannot perform at single time
//		searchBox1.clear();
	
*/
		
		driver.get("https://www.google.com/");
		WebElement ele= driver.findElement(By.name("q"));
		ele.sendKeys("selenium");
		Thread.sleep(2000);
		
	String s1 =	ele.getAttribute("value");
	System.out.println("Value before clear : " + s1);
    ele.clear();
    String s2= ele.getAttribute("value");
    System.out.println("Value after clear : " + s2);
		
		
 
		Thread.sleep(2000);
	//driver.quit();
	}

}
