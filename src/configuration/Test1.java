package configuration;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
public static WebDriver driver;
	
	@BeforeTest
	public void ClientAdminLogin(){
		System.setProperty("webdriver.chrome.driver","D:\\Hasan_Project\\Selenium Tools\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost:1385/Home/LoginNew");
		driver.findElement(By.id("userName")).sendKeys("rafsan");
		driver.findElement(By.id("userPassword")).sendKeys("123");
		driver.findElement(By.name("Action")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);

				WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				  public WebElement apply(WebDriver driver) {
				    return driver.findElement(By.id("foo"));
				  }
				});
		
		
	}

	 @Test(priority=0, timeOut=10)
	  public void CreateOrgStructureType() throws Exception {
		 
		 

		 	driver.findElement(By.linkText("Configuration and Setup")).click();
		    driver.findElement(By.linkText("Organization Structure")).click();
		    driver.findElement(By.linkText("Org. Structure type")).click();
		    driver.findElement(By.linkText("New")).click();
		    driver.findElement(By.id("Name")).click();
		    driver.findElement(By.id("Name")).sendKeys("Head Office");
		    driver.findElement(By.id("ShortName")).sendKeys("HO");
		    driver.findElement(By.xpath("//input[@value='Save']")).click();
		    driver.findElement(By.linkText("New")).click();
		    driver.findElement(By.id("Name")).sendKeys("Ware House");
		    driver.findElement(By.id("ShortName")).sendKeys("WH");
		    driver.findElement(By.xpath("//input[@value='Save']")).click();
		    /*WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement configuration = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Save']")));
			configuration.click();
			configuration.click();*/
	 }
	 

}
