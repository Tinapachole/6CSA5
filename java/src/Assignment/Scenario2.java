package Assignment;


	import java.util.Set;

	import org.openqa.selenium.Cookie;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Scenario2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		System.out.println("=========================================================");
		driver.manage().deleteCookieNamed("sb");
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
	}
	}
	

