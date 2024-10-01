package ui;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class REsizableElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/resizable/");
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		//select the dragable pointelement
		WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(element, 100, 50).perform();	
		//slider operation 
		driver.navigate().to("https://jqueryui.com/slider/");
		WebElement frame1=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame1);
		WebElement slide=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Thread.sleep(2000);
		//inorder find the cordinates of the webElement
		Point cordinate=slide.getLocation();
		int xcordinate=cordinate.getX();
		int ycoradinate=cordinate.getY();
		System.out.println(cordinate+"x cordinate="+xcordinate+" ycordiante="+ycoradinate);
		
		//in order to find size(width and height of the slide element
		Dimension  sizeelement=slide.getSize();
		int slideHeight=sizeelement.getHeight();
		int slideWidth=sizeelement.getWidth();
		System.out.println(sizeelement+"Slide Element height= "+slideHeight+"Slide Element width ="+slideWidth);
		
		//getRect(): Combines location and size into one Rectangle object .
		Rectangle rect=slide.getRect();
		System.out.println("Element's X coordinate: " + rect.getX());
		System.out.println("Element's Y coordinate: " + rect.getY());
		System.out.println("Element's width: " + rect.getWidth());
		System.out.println("Element's height: " + rect.getHeight());
		//this is to right click on the slide element
		action.contextClick(slide).perform();
		
		action.dragAndDropBy(slide, slideWidth*3, 00).perform();
		driver.quit();
	
	}

}
