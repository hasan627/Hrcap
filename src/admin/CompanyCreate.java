package admin;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CompanyCreate {
	public WebDriver driver;
	
	@BeforeTest
	public void ClientAdminLogin(){
		System.setProperty("webdriver.chrome.driver","D:\\Hasan_Project\\Selenium Tools\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:1385/Home/LoginNew");
		driver.findElement(By.id("userName")).sendKeys("rafsan");
		driver.findElement(By.id("userPassword")).sendKeys("123");
		driver.findElement(By.name("Action")).click();
	}
	
	@Test(priority=1)
	public void CreateCompany() throws InterruptedException{
		//driver.findElement(By.linkText("Change Company")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnCreate")).click();
	    driver.findElement(By.name("CompanyName")).sendKeys("Jibon Bima Corporation");
	    driver.findElement(By.id("companyShortName")).sendKeys("JBC");
	    driver.findElement(By.id("businessStructure")).click();
	    new Select(driver.findElement(By.id("businessStructure"))).selectByVisibleText("Corporation");
	    driver.findElement(By.id("businessStructure")).click();
	    driver.findElement(By.id("country")).click();
	    new Select(driver.findElement(By.id("country"))).selectByVisibleText("Bangladesh");
	    driver.findElement(By.id("country")).click();
	    driver.findElement(By.id("indusryID")).click();
	    new Select(driver.findElement(By.id("indusryID"))).selectByIndex(5);
	    driver.findElement(By.id("indusryID")).click();
	    driver.findElement(By.id("website")).sendKeys("jbc@gmail.com");
	    driver.findElement(By.id("fyStart")).click();
	    new Select(driver.findElement(By.id("fyStart"))).selectByVisibleText("July");
	    driver.findElement(By.id("fyStart")).click();
	    driver.findElement(By.id("fyEnd")).click();
	    new Select(driver.findElement(By.id("fyEnd"))).selectByVisibleText("June");
	    driver.findElement(By.id("fyEnd")).click();
	    driver.findElement(By.id("ddlDivisionId")).click();
	    new Select(driver.findElement(By.id("ddlDivisionId"))).selectByVisibleText("Dhaka");
	    driver.findElement(By.id("ddlDivisionId")).click();
	    driver.findElement(By.name("Website")).sendKeys("www.jbc.com.bd");
	    driver.findElement(By.id("PhoneNumber")).sendKeys("01627777777777");
	    driver.findElement(By.id("DivisionId")).click();
	    new Select(driver.findElement(By.id("DivisionId"))).selectByVisibleText("Dhaka");
	    driver.findElement(By.id("DivisionId")).click();
	    driver.findElement(By.id("submit")).click();
	    /*String ActualCompany = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[2]/div/div/table/tbody/tr/td[1]/a")).getText();
	    String ExpectedCompany = "Jibon Bima Corporation";
	    Assert.assertEquals(ActualCompany, ExpectedCompany, "Company Creation Failed");*/
	}
	
	@AfterTest
	public void Closed(){
		driver.quit();
	}
}
