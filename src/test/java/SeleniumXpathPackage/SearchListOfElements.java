package SeleniumXpathPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchListOfElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		/*
		List<WebElement> options =driver.findElements(By.name("Optionwithcheck[]"));
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
		
		*/
		
		// cssSelector "#" -id , "." -className
		//driver.findElement(By.cssSelector(".fname")).sendKeys("shradha");
		driver.findElement(By.cssSelector("#fname")).sendKeys("shradha");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
