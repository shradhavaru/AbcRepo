package SeleniumXpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHoverHandelMenuItem {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[text()='TVs & Appliances']")).click();

		driver.findElement(By.xpath("//*[@class='bpjkJb']"));

	}

}
