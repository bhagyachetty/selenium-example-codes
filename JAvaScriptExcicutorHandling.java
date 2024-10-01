package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JAvaScriptExcicutorHandling {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ae/");
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(js.executeScript("return document.title;"));//to print the title of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement element=driver.findElement(By.xpath("//*[@id=\"navFooter\"]"));
		//js.executeScript("arguments[0].scrollIntoView(true);",element );
		js.executeScript("arguments[0].style.border='5px solid green';",element );
		WebElement element2=driver.findElement(By.xpath("//a[text()='Your Orders']"));
		System.out.println(js.executeScript("arguments[0].textContent",element2 ));
		js.executeScript("arguments[0].style.color='red';",element2);

		js.executeScript("arguments[0].click();", element2);
		driver.close();
		
		

	}

}
