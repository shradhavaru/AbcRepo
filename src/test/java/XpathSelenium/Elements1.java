package XpathSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Elements1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		//Element testing xpath
		//enter the code  answerrrr
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//*[text()='Elements']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Elements']")).click();
		
		driver.findElement(By.className("text")).click();
		System.out.println("hello");
		Thread.sleep(2000);
		
		
		
		
		driver.quit();

	}

}
