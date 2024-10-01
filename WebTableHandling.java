package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		// step1 find the no of rows fro  the first row
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr"));
		int rowSize=rows.size();
		System.out.println(rowSize);
		// step2 find the no of columns from  the first data of the webtable Element of first row
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
		int colSize=columns.size();
		System.out.println(colSize);

		//iterate the for loop
		for(int i=1;i<=rowSize;i++)
		{
			for(int j=2;j<=colSize;j++)
			{
				WebElement tabledata=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[" +i+ "]/td[" +j+ "]"));
				String text=tabledata.getText();
				System.out.printf("%-20s",text);
			}
			System.out.println();
		}
		driver.close();

		
	}

}
