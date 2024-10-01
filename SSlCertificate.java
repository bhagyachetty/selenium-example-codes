package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSlCertificate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.navigate().to("https://self-signed.badssl.com/");
		driver.close();
	}

}
