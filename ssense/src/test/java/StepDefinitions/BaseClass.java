package StepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public static Logger logger;
	
	
	public void launchApp(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ssense\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	public void click(WebElement mensWearButtonxpath) {
		mensWearButtonxpath.click();
	}

}


