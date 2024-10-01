package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadWritefile {

	public static void main(String[] args) throws IOException {
		//we have to use properties class to read data from the the external file 
		//write data into file
		Properties property=new Properties();
		//in order to read  a data from properties file we need to use FileinputStream
		FileInputStream fi=new FileInputStream("C:\\Users\\aaa\\eclipse-workspace\\seleniumjava\\src\\test\\resources\\FilesPack\\property.properties");
		//in order to load the file 
		property.load(fi);
		//in order to raed the data from the property file
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("browser"));
		
		//in order to write data to file
		FileOutputStream fo=new FileOutputStream("C:\\Users\\aaa\\eclipse-workspace\\seleniumjava\\src\\test\\resources\\FilesPack\\property.properties");
		property.setProperty("FirstName", "bhagya");
		property.setProperty("Lastname", "patil");
		property.store(fo, "this is commnet");
		System.out.println("the data is sucsessfully written into the file please check the file!!");


		
		
		
	
	
	
	}
	
}

