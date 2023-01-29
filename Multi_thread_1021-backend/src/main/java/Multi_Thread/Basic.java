package Multi_Thread;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basic {

	public WebDriver driver;
	
	public WebDriver Browsers(String Browsername) {
		if(Browsername.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		    driver = (WebDriver) new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		
		}
		driver.get("https://www.google.com");
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	}
	
}
