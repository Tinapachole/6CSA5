package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapchat.com");
		driver.findElement(By.tagName("div"));
		System.out.println("element1 indentified");
		driver.findElement(By.tagName("img"));
		System.out.println("element2 indentified");
		driver.findElement(By.tagName("body"));
		System.out.println("element3 identified");
	}
	
	
	
}
