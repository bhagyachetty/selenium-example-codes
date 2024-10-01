package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fistscript {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");// one way
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button"));*/
		// 2nd way of enterring the data to webelement with keyboard actions
		WebElement usename = driver.findElement(By.id("user-name"));
		usename.sendKeys("standard_user" + Keys.TAB);
		WebElement pass = driver.switchTo().activeElement();
		pass.sendKeys("secret_sauce" + Keys.ENTER);

		driver.close();

	}

}
