
package admin;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientAdminCreate {
	public WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver","D:\\Hasan_Project\\Selenium Tools\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String baseurl = "http://localhost:1385/Home/LoginNew";
		driver.get(baseurl);
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Login - HRCap";
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Title Mismatch");	
	}
	
	@Test(priority=0)
	public void AdminLogin(){
		driver.findElement(By.id("userName")).sendKeys("admin");
		driver.findElement(By.id("userPassword")).sendKeys("123456");
		driver.findElement(By.name("Action")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void CreateClientAdmin(){
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li/div/ul[2]/li/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li/div/ul[2]/li/ul[2]/li/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div[2]/div/a")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Md Rafsan");
		driver.findElement(By.id("UserName")).sendKeys("rafsan");
		driver.findElement(By.id("Password")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div/div/div[3]/input")).click();
	}
	
	@Test(priority=2)
	public void Logout(){
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul[2]/li[2]/a/span[3]/i")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul[2]/li[2]/div/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/button")).click();
		
	}
	
	@AfterTest
	public void Closed(){
		driver.quit();

	}

}
