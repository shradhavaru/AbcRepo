package SeleniumXpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
Actions actions = new Actions(driver);
		
		
		
		driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");
        driver.findElement(By.tagName("body")).click();

        WebElement textField = driver.findElement(By.id("textInput"));
        new Actions(driver)
                .sendKeys(textField, "Selenium!")
                .perform();

        Assertions.assertEquals("Selenium!", textField.getAttribute("value"));
    

		Thread.sleep(1000);


		driver.quit();
	}

}
