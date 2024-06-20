package SeleniumXpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// 
		driver.get("https://www.google.com/");
		
		Actions actions = new Actions(driver);
		
		
		WebElement inputField = driver.findElement(By.name("q"));
		// Sending keys and performing Enter
        actions.sendKeys(inputField , "Selenium").sendKeys(Keys.ENTER).perform();
		
     // Double-clicking on an element
        WebElement elementToDoubleClick = driver.findElement(By.xpath("//div[@id='doubleClickElement']"));
        actions.doubleClick(elementToDoubleClick).perform();

        // Context-click (right-click) on an element
        WebElement elementToRightClick = driver.findElement(By.xpath("//div[@id='rightClickElement']"));
        actions.contextClick(elementToRightClick).perform();

        // Moving to an element
        WebElement elementToMoveTo = driver.findElement(By.xpath("//div[@id='elementToMoveTo']"));
        actions.moveToElement(elementToMoveTo).perform();
		
		
		driver.quit();
	}

}
