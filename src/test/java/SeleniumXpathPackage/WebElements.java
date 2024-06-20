package SeleniumXpathPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {


	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		
		/*
		//find Element
		driver.get("https://www.google.com/");
		//driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		searchBox.sendKeys("selenium");
		
	
		
		//find Elements
		driver.get("https://trytestingthis.netlify.app/");
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		
		for(WebElement ele : elements) {
			System.out.println("print: " +ele.getText());
		}
		
		
		
		//Element from Element
		driver.get("https://www.google.com/");
		
		WebElement searchForm = driver.findElement(By.tagName("form"));
		Thread.sleep(1000);
		System.out.println("Hello");
		WebElement searchBox = searchForm.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		System.out.println(searchBox);
		System.out.println("working");
		
		
		//get title
		 driver.get("https://www.facebook.com/");
		String title =driver.getTitle();
		
		
		
		//Get active element 
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
				String title= driver.switchTo().activeElement().getAttribute("title");
		System.out.println(title);
		
		
		
		//get element - tagName,Text,CSS value
		driver.get("https://www.facebook.com/");
		WebElement emailBox = driver.findElement(By.id("email"));
		String tagName=emailBox.getTagName();
		String text = emailBox.getText();
		String cssValue= emailBox.getCssValue("color");
		
		System.out.println(tagName +","+text+","+cssValue);
		*/
		
		//Enable and selected
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkBox = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		
//or 
		
//		Boolean box1 = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).isEnabled();
//		System.out.println(box1);
		
driver.quit();
	}

}
