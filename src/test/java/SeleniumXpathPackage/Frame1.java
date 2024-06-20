package SeleniumXpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();	
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
		
		driver.findElement(By.linkText("This page is displayed in an iframe"));
		
		

	}

}
