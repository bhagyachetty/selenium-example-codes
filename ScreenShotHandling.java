package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShotHandling {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		Date currentdate=new Date();
		System.out.println(currentdate);
		String StrDate=currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(StrDate);
		
		
		
		driver.navigate().to("https://www.amazon.ae/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		//this line will  take screen shot of the page
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		// inorder to save the file we need we need file utils
		FileUtils.copyFile(screenshot, new File(".//Screenshot/"+StrDate+".png"));
		driver.close();
		
		
		
		
	}

}
