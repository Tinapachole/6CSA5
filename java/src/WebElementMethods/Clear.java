package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("C:\\Users\\DELL\\Desktop");
	WebElement textbox= driver.findElement(By.xpath(null));
	textbox.clear();
	textbox.sendKeys("hello");
	
	
	
	
}
	
}
	
	
	
	
	

