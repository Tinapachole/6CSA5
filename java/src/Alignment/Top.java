package Alignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Top {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(4000);
	WebElement username= driver.findElement(By.name("username"));
	WebElement password= driver.findElement(By.name("password"));
	int userY = username.getRect().y;
	int userHeight = username.getRect().height;
	int passY= password.getRect().y;
	if(passY> userY+userHeight)
	System.out.println("top aligned");
	else
	System.out.println("not top aligned");
	
	
}
}
