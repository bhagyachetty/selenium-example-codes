package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(frame);
		WebElement fname=driver.findElement(By.xpath("//input[@id='fname']"));
		fname.clear();
		fname.sendKeys("bhagya");
		Actions action=new Actions(driver);
		action.keyDown(fname, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement lname=driver.findElement(By.xpath("//input[@id='lname']"));
		action.keyDown(lname, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

}
}

