package SeleniumXpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Actions actions =new Actions(driver);
		/*
		//moveToElement() and clickAndHold()
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA = driver.findElement(By.xpath("//*[text()='A']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()='D']"));
		
		Actions actions =new Actions(driver);
		actions.moveToElement(boxA);
		actions.clickAndHold();
		Thread.sleep(2000);
		actions.moveToElement(boxD);
		actions.release().perform();
		System.out.println("done");
		Thread.sleep(2000);
		driver.quit();
		
		//right click :-   contextClick()
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxD = driver.findElement(By.xpath("//*[text()='D']"));
		actions.contextClick(boxD);
		actions.build().perform();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("done");
		
		
		//doubleClick()
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxD = driver.findElement(By.xpath("//*[text()='D']"));
		actions.doubleClick(boxD);
		actions.build().perform();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("done");
		*/
		
		//dragAndDrop(sourceEle , targetEle)
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement ele1 = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(ele1, ele2);
		actions.build().perform();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("done");
		
		
	}

}
