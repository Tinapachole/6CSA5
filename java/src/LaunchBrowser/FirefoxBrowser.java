package LaunchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("WebDriver.gecko.driver","./geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
	}

}
