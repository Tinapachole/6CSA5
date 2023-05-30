package Assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesPractice1 {
public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
		Set<Cookie> allCookies= driver.manage().getCookies();
		System.out.println(allCookies.size());
       for(Cookie singleCooky:allCookies)
    	   System.out.println(singleCooky.getName());
       Cookie cooky= new Cookie("ABC","123");
       driver.manage().addCookie(cooky);
       allCookies= driver.manage().getCookies();
       System.out.println(allCookies.size());
       for(Cookie singleCooky:allCookies)
    	   System.out.println(singleCooky.getName());
	}
}

