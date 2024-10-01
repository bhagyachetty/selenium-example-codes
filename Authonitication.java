package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authonitication {
	static String username="admin";
	static String password="admin";

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		//driver.close();
	}

}
