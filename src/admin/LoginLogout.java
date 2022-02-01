package admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LoginLogout {
	public WebDriver driver;
	
	@BeforeTest
	public void SetupAndLogin(){
		System.setProperty("webdriver.chrome.driver","D:\\Hasan_Project\\Selenium Tools\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String baseurl = "http://localhost:1385/Home/LoginNew";
		driver.get(baseurl);
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Login - HRCap";
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Title Mismatch");	
		driver.findElement(By.id("userName")).sendKeys("rafsan");
		driver.findElement(By.id("userPassword")).sendKeys("123");
		driver.findElement(By.name("Action")).click();
	}
	
	/*@AfterTest
	public void Closed(){
		driver.quit();

	}*/


}
