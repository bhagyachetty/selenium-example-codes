package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.scientecheasy.com/2020/08/radio-button-in-selenium.html/");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//a[@rel='nofollow noopener']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		String parent=itr.next();
		String child=itr.next();
		System.out.println(parent);
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//input[@name='dhanbad']")).click();
		
		


	}

}
