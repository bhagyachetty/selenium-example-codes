package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.ae/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		Select select=new Select(dropdown);
		Thread.sleep(5000);
		select.selectByIndex(2);
		Thread.sleep(5000);
		select.selectByValue("search-alias=stripbooks");
		Thread.sleep(5000);
		select.selectByVisibleText("Computer & Accessories");
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
			String text=options.get(i).getText();
			System.out.println(text);
		}
		
		
		driver.close();
			
	}

}
