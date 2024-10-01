package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementmethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.ae/");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("charger");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).getAttribute("id"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).isSelected());
		driver.close();

	}

}
