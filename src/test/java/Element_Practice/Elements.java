package Element_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Elements extends BaseTest {

	@BeforeMethod
	public void Elements_Menu() {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement scrollelem = driver.findElement(By.xpath("(//div[@class='card-up'])[1]"));
		jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });"
		,scrollelem);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement click = driver.findElement(By.xpath("(//div[@class='card-up'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(click));
		click.click();

	}
	
	@Test
	public void Text_Box() {
		
		//Click Text Box in Elements Menu
		driver.findElement(By.id("item-0")).click();
		
		//Input Fullname
		driver.findElement(By.id("userName")).sendKeys("NewBie");
		
		//Input Email
		driver.findElement(By.id("userEmail")).sendKeys("NewBie@gmail.com");
				
		//Input Current Address
		driver.findElement(By.id("currentAddress")).sendKeys("Current Address");
	
		//Input Permanent Address
		//Scroll down to where the Input field for Permanent Address
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement scrollelem = driver.findElement(By.id("permanentAddress"));
		jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });"
		,scrollelem);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//wait till the visibility of the element
		WebElement permanent_address = driver.findElement(By.id("permanentAddress"));
		wait.until(ExpectedConditions.visibilityOf(permanent_address));
		permanent_address.sendKeys("Permanent Address");
		
		//Click Submit Button
		driver.findElement(By.id("submit")).click();
		
		//Validate the inputed data
		 
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		
		System.out.println(name.getText() + "\n" + email.getText() + "\n" + currentAddress.getText() + "\n" + permanentAddress.getText());
		
	}

	@Test
	public void Check_box() {
		
		//click Check Box on Menu
		driver.findElement(By.id("item-1")).click();
		
		//Click Toggle button beside Home CheckBox
		driver.findElement(By.xpath("//button[@title='Toggle']")).click();
		
		//Click toggle for desktop
		driver.findElement(By.xpath("(//button[@title='Toggle'])[2]")).click();
		
		//Click Commands Checkbox
		driver.findElement(By.xpath("//span[contains(text(), 'Commands')]")).click();
		
		//click Toggle for Documents
		driver.findElement(By.xpath("(//button[@title='Toggle'])[3]")).click();
		
		//SCroll down to part where click Workspace Toggle
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement workspace_toggle = driver.findElement(By.xpath("(//button[@title='Toggle'])[4]"));
		jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });"
		,workspace_toggle);
		
		//Click Toggle
		workspace_toggle.click();
		
		//Click React checkbox
		driver.findElement(By.xpath("//span[contains(text(), 'React')]")).click();
		
		//click Veu Check box
		driver.findElement(By.xpath("//span[contains(text(), 'Veu')]")).click();
	}
	
}
