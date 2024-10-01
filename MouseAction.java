package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.ae/");
		WebElement element=driver.findElement(By.xpath("//a[text()='Electronics']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.close();
	}

}
