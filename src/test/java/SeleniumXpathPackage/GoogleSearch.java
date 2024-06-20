package SeleniumXpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Movie", Keys.ENTER);
		
		System.out.println("success");

		Thread.sleep(2000);
		driver.quit();


	}

}
