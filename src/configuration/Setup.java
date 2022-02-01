package configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Setup {
public WebDriver driver;
	
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
	 @Test(priority=0)
	  public void CreateOrgStructureType() throws Exception {
		//driver.findElement(By.linkText("Jibon Bima Corporation")).click();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement configuration = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Configuration and Setup")));
		configuration.click();
		configuration.click();*/
		//Thread.sleep(1000);
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
	    //driver.findElement(By.xpath("//input[@value='Save']")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement configuration = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Save']")));
		configuration.click();
		configuration.click();
	    //Thread.sleep(2000);
	   } 
	 @Test(priority=1)
	  public void CreateOrganizationStructure() throws Exception {
	    //driver.get("http://localhost:1385/OrganizationType");
	    driver.findElement(By.linkText("Organizational Structure")).click();
	    driver.findElement(By.linkText("New Top Level")).click();
	    driver.findElement(By.id("Name")).sendKeys("Chief Executive Offiecer");
	    driver.findElement(By.id("ShortName")).sendKeys("CEO");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.linkText("Chief Executive Offiecer")).click();
	    driver.findElement(By.linkText("New Level-1")).click();
	    driver.findElement(By.id("Name")).sendKeys("General Manager");
	    driver.findElement(By.id("ShortName")).sendKeys("GM");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.linkText("General Manager")).click();
	    driver.findElement(By.linkText("New Level-2")).click();
	    driver.findElement(By.id("Name")).sendKeys("Development Manager");
	    driver.findElement(By.id("ShortName")).sendKeys("DM");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.linkText("New Level-2")).click();
	    driver.findElement(By.id("Name")).sendKeys("QA Manager");
	    driver.findElement(By.id("ShortName")).sendKeys("QAM");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    Thread.sleep(2000);
	  }	 
	 @Test(priority=2)
	  public void GeneralWorkShift() throws Exception {
		/*driver.findElement(By.linkText("Configuration and Setup")).click();
		driver.findElement(By.linkText("Organization Structure")).click();
		driver.findElement(By.linkText("Org. Structure type")).click();*/
	    driver.findElement(By.linkText("Settings")).click();
	    driver.findElement(By.linkText("Work Shift")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("New")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("WorkShiftName")).sendKeys("General Shift");
	    driver.findElement(By.id("WorkShiftShortName")).sendKeys("GS");
	    driver.findElement(By.id("ColorId")).click();
	    new Select(driver.findElement(By.id("ColorId"))).selectByVisibleText("INDIANRED");
	    driver.findElement(By.id("ColorId")).click();
	    WebElement TimeFrom = driver.findElement(By.id("TimeFrom"));
	    TimeFrom.sendKeys("0930AM");
	    driver.findElement(By.id("TimeTo")).sendKeys("1830PM");
	    driver.findElement(By.id("BreakFrom")).sendKeys("1300PM");
	    driver.findElement(By.id("BreakTo")).sendKeys("14:00 PM");
	    driver.findElement(By.id("Description")).sendKeys("This is General Shift");
	    driver.findElement(By.id("btnSubmit")).submit();
	    Thread.sleep(2000);
	  }
	 @Test(priority=3)
	  public void CreateWorkPlan() throws Exception {
	    driver.findElement(By.xpath("//table[@id='summary']/tbody/tr/td[11]/a[2]/i")).click();
	    driver.findElement(By.id("NewWorkPlan_IsLateAllowed")).click();
	    driver.findElement(By.id("NewWorkPlan_LateHour")).sendKeys("0910AM");
	    driver.findElement(By.id("NewWorkPlan_IsOverTime")).click();
	    driver.findElement(By.id("NewWorkPlan_OverTimeHour")).sendKeys("1900PM");
	    driver.findElement(By.xpath("//td")).click();
	    driver.findElement(By.id("Days_0__IsWorkDay")).click();
	    driver.findElement(By.id("Days_1__IsWorkDay")).click();
	    driver.findElement(By.id("Days_2__IsWorkDay")).click();
	    driver.findElement(By.id("Days_3__IsWorkDay")).click();
	    driver.findElement(By.id("Days_4__IsWorkDay")).click();
	    driver.findElement(By.id("NewWorkPlan_Description")).sendKeys("Setup Work Plan");
	    driver.findElement(By.xpath("(//input[@name='Action'])[2]")).click();
	    Thread.sleep(2000);
	  }
	 @Test(priority=4)
	  public void RosterMorningShift() throws Exception {
		driver.findElement(By.linkText("Work Shift")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("WorkShiftName")).sendKeys("Rostering Morning Shift");
	    driver.findElement(By.id("WorkShiftShortName")).sendKeys("GS");
	    driver.findElement(By.id("ColorId")).click();
	    new Select(driver.findElement(By.id("ColorId"))).selectByVisibleText("Limegreen");
	    driver.findElement(By.id("ColorId")).click();
	    WebElement TimeFrom = driver.findElement(By.id("TimeFrom"));
	    TimeFrom.sendKeys("0700AM");
	    driver.findElement(By.id("TimeTo")).sendKeys("1500PM");
	    driver.findElement(By.id("BreakFrom")).sendKeys("1200PM");
	    driver.findElement(By.id("BreakTo")).sendKeys("13:00 PM");
	    driver.findElement(By.id("Description")).sendKeys("This is Morning Shift for Rostering");
	    driver.findElement(By.id("IsRoster")).click();
	    driver.findElement(By.id("btnSubmit")).submit();
	  }
	 
	 @Test(priority=5)
	  public void CreateFinancialYear() throws Exception {
	    driver.findElement(By.linkText("Financial Year")).click();
	    driver.findElement(By.linkText("New Financial Year")).click();
	    WebElement startmonth = driver.findElement(By.id("select2-FYStartMonthId-container"));
	    startmonth.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='search']")).clear();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("July"+Keys.ENTER);
	    WebElement endtmonth = driver.findElement(By.id("select2-FYEndingMonthId-container"));
	    endtmonth.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='search']")).clear();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("June"+Keys.ENTER);
	    driver.findElement(By.id("SearchBtn")).submit();
	  }
	 
	 @Test(priority=6)
	  public void CreateLocation() throws Exception {
		 driver.findElement(By.linkText("Location")).click();
		    driver.findElement(By.linkText("New")).click();
		    driver.findElement(By.id("LocationName")).sendKeys("Mohammadpur");
		    driver.findElement(By.id("LocationCode")).sendKeys("1217");
		    driver.findElement(By.id("BlockOrSectorNo")).sendKeys("8");
		    driver.findElement(By.id("RoadOrStreetNo")).sendKeys("20");
		    driver.findElement(By.id("BuildingorHouseName")).sendKeys("ABC");
		    driver.findElement(By.id("HouseOrVillageNo")).sendKeys("5");
		    driver.findElement(By.id("FlatNo")).sendKeys("5");
		    driver.findElement(By.id("Area")).sendKeys("Uttara");
		    driver.findElement(By.id("DivisionId")).click();
		    new Select(driver.findElement(By.id("DivisionId"))).selectByVisibleText("Dhaka");
		    driver.findElement(By.id("DivisionId")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("DistricId")).click();
		    new Select(driver.findElement(By.id("DistricId"))).selectByVisibleText("Dhaka");
		    driver.findElement(By.id("DistricId")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("ThanaId")).click();
		    new Select(driver.findElement(By.id("ThanaId"))).selectByVisibleText("Uttar Khan");
		    driver.findElement(By.id("ThanaId")).click();
		    driver.findElement(By.id("PostOffice")).sendKeys("1217");
		    driver.findElement(By.id("Save")).click();
	  }

	/*@Test(priority=7)
	  public void CreateProject() throws Exception {
	    driver.findElement(By.linkText("Project")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("txtProjectName")).click();
	    driver.findElement(By.xpath("//form/div/div[2]")).click();
	    driver.findElement(By.id("txtProjectName")).sendKeys("Human Resource");
	    driver.findElement(By.id("InternalActivityCode")).sendKeys("0011");
	    driver.findElement(By.id("ProjectShortName")).sendKeys("HRCap");
	    driver.findElement(By.id("TotalBudget")).sendKeys("2500000");
	    driver.findElement(By.id("EntryDate")).sendKeys("13/02/2020"+Keys.ENTER);
	    driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select")).sendKeys("13/08/2020"+Keys.ENTER);
	    driver.findElement(By.id("AssetLocationId")).click();
	    new Select(driver.findElement(By.id("AssetLocationId"))).selectByIndex(1);
	    driver.findElement(By.id("AssetLocationId")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("SubLocationID")).click();
	    new Select(driver.findElement(By.id("SubLocationID"))).selectByVisibleText("Kemal Ataturk Avenue");
	    driver.findElement(By.id("SubLocationID")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("SubSubLocationID")).click();
	    new Select(driver.findElement(By.id("SubSubLocationID"))).selectByVisibleText("ABC House");
	    driver.findElement(By.id("SubSubLocationID")).click();
	    driver.findElement(By.id("Save")).click();
	  }*/

	 @Test(priority=8)
	  public void CreateGradeType() throws Exception {
	    driver.findElement(By.linkText("Grade Type")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("GradeTypeName")).sendKeys("A");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("GradeTypeName")).sendKeys("B");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	/*@Test
	  public void CreateOfficeHolidays() throws Exception {
	    driver.findElement(By.linkText("Settings")).click();
	    driver.findElement(By.linkText("Office Holidays")).click();
	    driver.findElement(By.linkText("New Office Holiday")).click();
	    driver.findElement(By.xpath("//span[2]/div/button/span")).click();
	    driver.findElement(By.xpath("//input[@value='22093']")).click();
	    driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div[2]")).click();
	    driver.findElement(By.id("StartHoliday")).click();
	    driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select")).click();
	    driver.findElement(By.linkText("1")).click();
	    driver.findElement(By.id("HolidayId")).click();
	    new Select(driver.findElement(By.id("HolidayId"))).selectByVisibleText("International Workers' Day");
	    driver.findElement(By.id("HolidayId")).click();
	    driver.findElement(By.xpath("//form/div[2]")).click();
	    driver.findElement(By.id("btnAdd")).click();
	  }

	@Test
	  public void CreateUserRole() throws Exception {
	    driver.get("http://184.168.120.56:1385/Home/LoginNew");
	    driver.findElement(By.id("userName")).click();
	    driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("salman00");
	    driver.findElement(By.id("userPassword")).clear();
	    driver.findElement(By.id("userPassword")).sendKeys("123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("ReturnModuleHome")).click();
	    driver.findElement(By.xpath("//div[9]/article/div/div/a/span")).click();
	    driver.findElement(By.linkText("User")).click();
	    driver.findElement(By.linkText("Role")).click();
	    driver.findElement(By.linkText("New Role")).click();
	    driver.findElement(By.id("Role_Name")).click();
	    driver.findElement(By.id("Role_Name")).clear();
	    driver.findElement(By.id("Role_Name")).sendKeys("Admin");
	    driver.findElement(By.id("Role_Short_Name")).click();
	    driver.findElement(By.id("Role_Short_Name")).clear();
	    driver.findElement(By.id("Role_Short_Name")).sendKeys("admin");
	    driver.findElement(By.xpath("//button[@id='btnAdd']/i")).click();
	  }

	@Test
	  public void AddPriviledgeForRole() throws Exception {
	    driver.get("http://184.168.120.56:1385/Home/LoginNew");
	    driver.findElement(By.id("userName")).click();
	    driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("salman00");
	    driver.findElement(By.id("userPassword")).clear();
	    driver.findElement(By.id("userPassword")).sendKeys("123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("ReturnModuleHome")).click();
	    driver.findElement(By.xpath("//div[9]/article/div/div/a/span")).click();
	    driver.findElement(By.linkText("User")).click();
	    driver.findElement(By.linkText("Role")).click();
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.id("root")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Configuration and Setup')]")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Employee Profile")).click();
	    driver.findElement(By.xpath("//form/div/div/div")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.xpath("//button[@id='btnAdd']/i")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Leave Management")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.xpath("//button[@id='btnAdd']/i")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Self-Service")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.id("allCheck")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=allCheck | ]]
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Attendance")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Payroll")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Tax")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Provident Fund")).click();
	    driver.findElement(By.xpath("//form/div/div/div")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Rostering")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Notification')])[3]")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.xpath("//button[@id='btnAdd']/i")).click();
	    driver.findElement(By.linkText("Summary")).click();
	    driver.findElement(By.linkText("Employee Benefits Management")).click();
	    driver.findElement(By.id("allCheck")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.linkText("Summary")).click();
	  }

	 @Test
	  public void testGivenAccess() throws Exception {
	    driver.get("http://184.168.120.56:1385/Home/LoginNew");
	    driver.findElement(By.id("userName")).click();
	    driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("salman00");
	    driver.findElement(By.id("userPassword")).clear();
	    driver.findElement(By.id("userPassword")).sendKeys("123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("ReturnModuleHome")).click();
	    driver.findElement(By.xpath("//div[9]/article/div/div/a/span")).click();
	    driver.findElement(By.linkText("User")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'User')])[2]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Give Access')])[2]")).click();
	    driver.findElement(By.linkText("New Access")).click();
	    driver.findElement(By.id("select2-RoleID-container")).click();
	    driver.findElement(By.id("checkAll")).click();
	    driver.findElement(By.id("btnAdd")).click();
	  }*/

	  @Test(priority=9)
	  public void CreateDesignation() throws Exception {
	    driver.findElement(By.linkText("Employee Master")).click();
	    driver.findElement(By.linkText("Designation")).click();
	    driver.findElement(By.xpath("//div[2]/div/a/i")).click();
	    driver.findElement(By.id("DesignationName")).sendKeys("Admin");
	    driver.findElement(By.id("ShortCode")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	@Test(priority=10)
	  public void CreateReligion() throws Exception {
	    driver.findElement(By.linkText("Religion")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("ReligionName")).sendKeys("Islam");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	@Test(priority=11)
	  public void CreateMaritalStatus() throws Exception {
	    driver.findElement(By.linkText("Marital Status")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("MaritalStatusName")).sendKeys("Widowed");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	/*@Test(priority=12)
	  public void CreateGender() throws Exception {
	    driver.findElement(By.linkText("Gender")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("GenderName")).sendKeys("Male");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }*/

	@Test(priority=13)
	  public void CreateBloodGroup() throws Exception {
	    driver.findElement(By.linkText("Blood Group")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("BloodGroupName")).sendKeys("A+");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	@Test(priority=14)
	  public void CreateDepartment() throws Exception {
	    driver.findElement(By.linkText("Department")).click();
	    driver.findElement(By.linkText("New Top Level")).click();
	    driver.findElement(By.id("DeptName")).sendKeys("Software Development");
	    driver.findElement(By.id("ShortCode")).sendKeys("SD");
	    driver.findElement(By.xpath("//div[3]/div")).click();
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	@Test(priority=15)
	  public void CreateQualificationLevel() throws Exception {
	    driver.findElement(By.linkText("Qualification Level (Degree)")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("QualificationLevelName")).sendKeys("M. Sc computer science");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	 @Test(priority=16)
	  public void CreateEmploymentStatus() throws Exception {
	    driver.findElement(By.linkText("Employement Status")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("EmployementName")).sendKeys("Employee");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }
	@Test(priority=17)
	  public void CreateEmploymentType() throws Exception {
	    driver.findElement(By.linkText("Employment Type")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("EmploymentTypeName")).sendKeys("Probationary");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	@Test(priority=18)
	  public void CreateBankInformation() throws Exception {
	    driver.findElement(By.linkText("Bank Information")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("BankName")).sendKeys("Dutch Bangla Bank");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	@Test(priority=19)
	  public void CreateEducationalBoard() throws Exception {
	    driver.findElement(By.linkText("Education Board")).click();
	    driver.findElement(By.xpath("//div[2]/div/a/i")).click();
	    driver.findElement(By.id("BoardName")).sendKeys("Comilla");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	@Test(priority=20)
	  public void CreateEmployeeCategory() throws Exception {
	    driver.findElement(By.linkText("Employee Category")).click();
	    driver.findElement(By.xpath("//div[2]/div/a/i")).click();
	    driver.findElement(By.id("CategoryName")).sendKeys("Management");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.xpath("//div[2]/div/a/i")).click();
	    driver.findElement(By.id("CategoryName")).sendKeys("Non-Management");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	  }

	@Test(priority=21)
	  public void CreateRelationWithEmployee() throws Exception {
	    driver.findElement(By.linkText("Relation With Employee")).click();
	    driver.findElement(By.linkText("New Relation")).click();
	    driver.findElement(By.id("Name")).sendKeys("Wife");
	    driver.findElement(By.xpath("(//input[@name='Action'])[2]")).click();
	  }

	@Test(priority=22)
	  public void CreateApprovalFlow() throws Exception {
		driver.findElement(By.linkText("Employee Master")).click();
	    driver.findElement(By.linkText("Approval Rule Setup")).click();
	    driver.findElement(By.linkText("Approval Rules & Work Flow Configuration")).click();
	    driver.findElement(By.id("NewApproval_Level")).click();
	    new Select(driver.findElement(By.id("NewApproval_Level"))).selectByVisibleText("N+1");
	    driver.findElement(By.id("NewApproval_Level")).click();
	    driver.findElement(By.xpath("//form/div/div[2]/div/div/button")).click();
	    Thread.sleep(1500);
	  }

	 @Test(priority=23)
	  public void CreateFunctionalApproval() throws Exception {
	    driver.findElement(By.linkText("Functional Approval")).click();
	    driver.findElement(By.linkText("Attendance Entry")).click();
	    driver.findElement(By.linkText("Mohammadpur")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("Flow_Name")).sendKeys("Mohammadpur");
	    driver.findElement(By.id("Flow_Order")).sendKeys("1");
	    driver.findElement(By.id("Flow_RequiredToApprove")).sendKeys("1");
	    driver.findElement(By.id("Flow_TotalAssignedForApprove")).sendKeys("1");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//div[@id='flowSummary']/div[2]/table/tbody/tr/td/a/i")).click();
	    driver.findElement(By.linkText("Back")).click();
	    driver.findElement(By.xpath("//div[@id='flowSummary']/div[2]/table/tbody/tr/td/a[2]/i")).click();
	    driver.findElement(By.xpath("//div[@id='QuickSalaryModal']/div/div/div[2]/div/div/span/span/span")).click();
	    driver.findElement(By.xpath("//input[@type='search']")).clear();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("mas");
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("EmpOrder")).sendKeys("1");
	    driver.findElement(By.xpath("//button[@onclick='SaveEmployee()']")).click();
	    driver.findElement(By.xpath("//button[@id='modalClose2']/span")).click();
	    driver.findElement(By.xpath("//div[3]")).click();
	  }
	 	 
}
