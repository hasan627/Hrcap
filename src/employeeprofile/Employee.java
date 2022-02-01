package employeeprofile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Employee {
	public WebDriver driver;
	@Test(priority=0)
	public void ClientAdminLogin(){
		System.setProperty("webdriver.chrome.driver","D:\\Hasan_Project\\Selenium Tools\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://localhost:1385/Home/LoginNew");
		driver.findElement(By.id("userName")).sendKeys("rafsan");
		driver.findElement(By.id("userPassword")).sendKeys("123");
		driver.findElement(By.name("Action")).click();
	}
	
	/*@Test(priority=1)
	public void SelectCompany(){
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/table/tbody/tr[1]/td[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[2]/a/i")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[1]/a/i")).click();
	}*/
	

	
	@Test(priority=1)
	  public void EmployeeCreate() throws Exception {
	    // Label: Test
	    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1366,625 | ]]
	    driver.get("http://localhost:1385/CompanySetup");
	    // Label: Select Company
	    driver.findElement(By.id("btnSelect0")).click();
	    Thread.sleep(5000);
	    // Label: Change Module
	   // driver.findElement(By.id("ReturnModuleHome")).click();
	    //Thread.sleep(3000);
	    // Label: Click Employee Profile Module
	    driver.findElement(By.linkText("Employee Profile")).click();
	    Thread.sleep(3000);
	    for(int i=1; i<3;i++){
	    driver.findElement(By.linkText("Add New Employee")).click();
	    // Label: Input Employee Info
	    
	    driver.findElement(By.id("FirstName")).sendKeys("Shadat Hossain"+i);
	   
	    driver.findElement(By.id("select2-LocationId-container")).click();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Mohammadpur"+Keys.ENTER);
	    driver.findElement(By.id("select2-DesignationId-container")).click();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Admin"+Keys.ENTER);
	    driver.findElement(By.id("deptId")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='expandible-tree-dept']/ul/li[1]")).click();
	    driver.findElement(By.id("btnSaveDeptInfo")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("select2-WorkShiftId-container")).click();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("General Shift"+Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("select2-EmployeeCategoryId-container")).click();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Management"+Keys.ENTER);
	    driver.findElement(By.id("inputGroup-sizing-default")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='expandible-tree']/ul/li[2]")).click();
	    driver.findElement(By.id("btnSaveInternalMovementInfo")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("select2-GradeID-container")).click();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("A"+Keys.ENTER);
	    driver.findElement(By.name("JoiningDate")).sendKeys("01/04/2021");
	    driver.findElement(By.id("MobileNo1")).sendKeys("01627558589658");
	    driver.findElement(By.id("btnSubmit")).submit();
	    }
	  }
	

}
