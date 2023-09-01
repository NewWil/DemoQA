package Element_Practice;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {
	String parentTab;
	WebDriver driver;
	
	@BeforeMethod
	public void Base() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addExtensions(new File ("./Extensions/AdBlock.crx"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\ChromeDriver_115v\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		  //switch to iframe to click the close button in ads 
		//driver.switchTo().frame("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0");
		  
		  //Click Close button in ads 
		  //driver.findElement(By.id("close-fixedban")).click();
		
		  //switch to main page 
		  //driver.switchTo().defaultContent();
		 
	}

	@AfterMethod
	public void teardown() {
		//driver.quit();
	}

}
