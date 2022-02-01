package configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForDebug {
	
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
		
		
	}
	
	/*@Test(priority=0)
	 public static void waitForElement(By expectedElement, int timeout) {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, timeout);
		        wait.until(ExpectedConditions.visibilityOfElementLocated(expectedElement));

		    } catch (Exception e) {
		        e.printStackTrace();
		        //System.out.println("print ur message here");
		    }
	 }
	*/

	
	 @Test(priority=0)
	  public void CreateOrgStructureType() throws Exception {
		try{

			//driver.findElement(By.linkText("Jibon Bima Corporation")).click();
			//Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Configuration and Setup")));
			driver.findElement(By.linkText("Configuration and Setup")).click();
			driver.findElement(By.linkText("Organization Structure")).click();
			driver.findElement(By.linkText("Org. Structure type")).click();
			driver.findElement(By.linkText("New")).click();
			//Thread.sleep(1000);
			WebDriverWait wait2 = new WebDriverWait(driver, 5);
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("Name")));
			driver.findElement(By.id("Name")).sendKeys("Head Office");
			driver.findElement(By.id("ShortName")).sendKeys("HO");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("New")).click();
			//Thread.sleep(1000);
			driver.findElement(By.id("Name")).sendKeys("Ware House");
			driver.findElement(By.id("ShortName")).sendKeys("WH");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	 
	 
} 

