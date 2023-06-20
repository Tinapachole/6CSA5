package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement Username= driver.findElement(By.id("email"));
	System.out.println(Username.getRect().x);
	System.out.println(Username.getRect().y);
	
	
	System.out.println(Username.getRect().width);	
	System.out.println(Username.getRect().height);
	
	
}
	
}
