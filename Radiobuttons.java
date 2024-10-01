package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radiobuttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://selenium08.blogspot.com/2019/08/radio-buttons.html");
		WebElement radio=driver.findElement(By.xpath("//input[@type='radio'] [@name='yellow']"));
		System.out.println(radio.isDisplayed());
		
		if(radio.isDisplayed()==true)
		{
			radio.click();
			System.out.println("yellow butoon clicked");
		}
		radio.click();
		driver.findElement(By.xpath("//input[@type='radio'][@name='red']")).click();
		System.out.println("red button os selected");
		driver.findElement(By.xpath("//input[@name='dhanbad']")).click();
		System.out.println("dhanbad is selected ");
		driver.close();
		
		
		

	}

}
