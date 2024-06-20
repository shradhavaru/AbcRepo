package SeleniumXpathPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

//old way, now we dont use
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();	
		driver.get("https://www.google.com");
	//	driver.get("https://www.udemy.com");
		driver.navigate().to("https://www.udemy.com");
		//get current url and title
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		System.out.println("successfuly lauched browser and open application by URL");
		
		//timeout
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		//driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(1));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("(//*[text()=\"Data Science\"])[2]")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//*[text()=\"ChatGPT\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Thread.sleep(3000);
		System.out.println("Xpath");
		
		driver.close();
	}

}
