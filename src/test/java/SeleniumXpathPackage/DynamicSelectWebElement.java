package SeleniumXpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelectWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropDown = driver.findElement(By.id("option"));
		Select selectObj = new Select(dropDown);
		
		
		//select option from dropDown
		
		selectObj.selectByIndex(1);
		Thread.sleep(1000);
		selectObj.selectByValue("option 2");
		Thread.sleep(1000);
		selectObj.selectByVisibleText("Option 3");
	
		
		
		/*
		//DeSelect option from dropdown
		
		WebElement dropDown1 = driver.findElement(By.id("owc"));
		Select selectObj1 = new Select(dropDown1);
		
		selectObj1.selectByIndex(1);
		Thread.sleep(1000);
		selectObj1.selectByValue("option 2");
		Thread.sleep(1000);
		selectObj1.selectByVisibleText("Option 3");
		Thread.sleep(1000);
		
		//selectObj1.deselectByIndex(3);
		//selectObj1.deselectByVisibleText("Option 3");
		selectObj1.deselectByValue("option 2");
		*/
		
		
		
		// 1 ) store dropdown options in a list - 2 types
		/*
		 * 
		WebElement dropDown = driver.findElement(By.id("option"));
		Select selectObj = new Select(dropDown);
		
		List<WebElement> allOption= driver.findElements(By.id("option"));
		for(WebElement option : allOption) {
		System.out.println(option.getText());
		}
		*/
		
		/*
		// 2 ) store dropdown options in a list - 2 types
		List<WebElement> allOptions2 = selectObj.getOptions();
		
		for(WebElement option1 : allOptions2) {
			System.out.println(option1.getText());
		}
		*/
		
		
		
		
		Thread.sleep(1000);
		System.out.println("done");
		
		driver.quit();

	}

}
