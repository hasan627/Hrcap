package configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationIntegration {
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
	public void AdminLogin() throws InterruptedException{
		driver.findElement(By.id("userName")).sendKeys("admin");
		driver.findElement(By.id("userPassword")).sendKeys("123456");
		driver.findElement(By.name("Action")).click();
		Thread.sleep(1000);
	}
	@Test(priority=1)
	public void AutomationIntegrationSetup(){
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("Automation & Integration Setup")).click();
		driver.findElement(By.id("select2-NewAutomatedPayroll_CompanyId-container")).click();
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("jibon Bima Corporation"+Keys.ENTER);
		driver.findElement(By.id("Age_CheckBox")).click();
	    driver.findElement(By.id("Age")).sendKeys("60");
	    driver.findElement(By.id("NewAutomatedPayroll_IsPayroll")).click();
	    driver.findElement(By.xpath("(//input[@id='NewAutomatedPayroll_SalaryTemplateType'])[2]")).click();
	    driver.findElement(By.id("NewAutomatedPayroll_IsAutoTax")).click();
	    driver.findElement(By.id("NewAutomatedPayroll_IsAttendance")).click();
	    driver.findElement(By.id("NewAutomatedPayroll_IsLeaveEncash")).click();
	    driver.findElement(By.id("NewAutomatedPayroll_IsOverTimeCalculation")).click();
	    driver.findElement(By.id("NewAutomatedPayroll_IsAdvanceSalaryAdjustment")).click();
	    driver.findElement(By.id("NewAutomatedPayroll_IsAutoLoan")).click();
	    driver.findElement(By.id("NewAutomatedPayroll_IsPFLoanEligible")).click();
	    driver.findElement(By.id("NewAutomatedPayroll_IsGPFAutoDeduction")).click();
	    driver.findElement(By.id("DateFormateMasterId")).click(); 
	    Select DateFormat = new Select(driver.findElement(By.id("DateFormateMasterId")));
	    DateFormat.selectByIndex(1);
	    driver.findElement(By.id("btnSave")).click();
	}
	
	@AfterTest
	public void sessionend(){
		//driver.quit();
		driver.close();
	}
}
