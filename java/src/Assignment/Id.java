package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.fb.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("facebook"));
	System.out.println("element1 identified");
	driver.get("https://www.instagram.com");
	driver.findElement(By.id("fb-root"));
	System.out.println("element2 identified");
	driver.get("https://www.zomato.com");
	driver.findElement(By.id("__LOADABLE_REQUIRED_CHUNKS__"));
	System.out.println("element3 identified");
	driver.get("https://www.swiggy.com");
	driver.findElement(By.id("root"));
	System.out.println("element4 identified");
	driver.get("https://www.meesho.com");
	driver.findElement(By.id("__NEXT_DATA__"));
	System.out.println("element5 identified");
	driver.get("https://www.snapchat.com");
	driver.findElement(By.id("PopupProvider"));
	System.out.println("element6 identified");
	driver.get("https://www.twitter.com");
	driver.findElement(By.id("react-root"));
	System.out.println("element7 identified");
	driver.get("https://www.templerun.com");
	driver.findElement(By.id("i6"));
	System.out.println("element8 identified");
	driver.get("https://www.amazon.com");
	driver.findElement(By.id("nav-upnav"));
	System.out.println("element9 identified");
	driver.get("https://www.mindicator.com");
	driver.findElement(By.id("promo"));
	System.out.println("element10 identified");
	
	
	driver.close();
	

}
}
