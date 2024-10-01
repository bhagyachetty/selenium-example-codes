package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class WaitHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicite wait apllicable for alla elements in webpage
		driver.navigate().to("https://www.amazon.ae/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//explicit wait
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Electronics']")))).click();

		//fluent wait
		Wait<WebDriver> fluentWait= new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class)
				.withMessage(" ignore exception");
		fluentWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[text()='Electronics']")));
		driver.close();
		
	}

}
