package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id1 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.fb.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("u_0_0_GV"));
	System.out.println("element identified");
	driver.close();
	
	
}
	
	
	
}
