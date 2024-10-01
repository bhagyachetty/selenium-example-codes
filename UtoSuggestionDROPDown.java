package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class UtoSuggestionDROPDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
		element.sendKeys("dubai");
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		
		
		
		driver.close();
			
	}

}
