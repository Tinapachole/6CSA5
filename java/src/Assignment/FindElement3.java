package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement3 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	driver.findElements(By.tagName("div"));
	System.out.println("element1 indentified");
	driver.get("https://www.myntra.com/");
	driver.findElement(By.tagName("img"));
	System.out.println("element2 indentified");
	driver.get("https://www.snapchat.com");
	driver.findElement(By.tagName("a"));
	System.out.println("element3 identified");
	driver.get("https://www.netflix.com/in/");
	driver.findElement(By.tagName("input"));
	System.out.println("element4 identified");
	driver.get("https://www.fb.com");
	driver.findElements(By.tagName("script"));
	System.out.println("element5 indentified");
	driver.get("https://www.instagram.com/in/");
	driver.findElements(By.tagName("img"));
	System.out.println("element6 indentified");
	
	
	
	
	
}
}
	

