package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
 public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.fb.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("facebook"));
	System.out.println("element identified");
	driver.close();
	
}
}
