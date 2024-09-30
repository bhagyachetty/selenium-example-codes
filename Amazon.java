package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.ae/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("laptops" + Keys.ENTER);
		List<WebElement> elements = driver
				.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
		int count = 0;
		for (WebElement element : elements) {
			System.out.println("\n" + element.getText());
			count++;
		}
		System.out.println(count);

		// to handle check list
		driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[12]")).isDisplayed();
		driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[12]")).click();
		driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[12]")).click();
		driver.close();


	}

}
