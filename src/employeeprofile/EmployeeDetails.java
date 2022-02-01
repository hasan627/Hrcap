package employeeprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Iterator;		
import java.util.Set;	

public class EmployeeDetails extends admin.LoginLogout{
	@Test(priority=0)
	public void ClickEmployee() throws InterruptedException{
		//Click Company
		//driver.findElement(By.id("btnSelect0")).click();
		//Thread.sleep(5000);
		 // Label: Change Module
		//driver.findElement(By.id("ReturnModuleHome")).click();
		//Thread.sleep(3000);
		WebElement employeeprofile = driver.findElement(By.linkText("Employee Profile"));
		employeeprofile.click();
		driver.findElement(By.name("EmployeeId")).sendKeys("001");
		driver.findElement(By.id("SearchBtn")).click();
		driver.findElement(By.linkText("001")).click();
		Thread.sleep(2500);
		
		String MainWindow=driver.getWindowHandle();		
        // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                   driver.switchTo().window(ChildWindow);
               
			// Closing the Child Window.
                       // driver.close();		
            }		
            
        }		
        // Switching to Parent window i.e Main Window.
           //driver.switchTo().window(MainWindow);
           
        // Closing the Child Window.
           // driver.close();

	}
	@Test(priority=1)
	public void PersonalInfo() throws InterruptedException{
		driver.findElement(By.xpath("//a[@id='sidebarCollapse']/i")).click();
	    driver.findElement(By.id("PersionalInformation")).click();
	    WebElement datebox = driver.findElement(By.name("DateOfBirth"));
	    datebox.sendKeys("06031992"+Keys.ENTER);
	    Thread.sleep(1000);
	    Select DateFormat = new Select(driver.findElement(By.id("MaritalStatusId")));
	    DateFormat.selectByIndex(1);
	    driver.findElement(By.id("GenderId")).click();
	    new Select(driver.findElement(By.id("GenderId"))).selectByIndex(1);
	    driver.findElement(By.id("GenderId")).click();
	    driver.findElement(By.id("BloodGroupId")).click();
	    new Select(driver.findElement(By.id("BloodGroupId"))).selectByIndex(1);
	    driver.findElement(By.id("BloodGroupId")).click();
	    driver.findElement(By.id("ReligionId")).click();
	    new Select(driver.findElement(By.id("ReligionId"))).selectByIndex(1);
	    driver.findElement(By.id("ReligionId")).click();
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    Thread.sleep(1000);
		
	}
	@Test(priority=2)
	  public void IdentificationCreate() throws Exception {
	    driver.findElement(By.xpath("//a[@id='sidebarCollapse']/i")).click();
	    driver.findElement(By.id("Identification")).click();
	    driver.findElement(By.id("NidNo")).sendKeys("234234");
	    driver.findElement(By.id("file1")).sendKeys("C:\\Users\\tbslaptop\\Desktop\\Upload\\image.jpg");
	    driver.findElement(By.id("TaxZoneId")).click();
	    new Select(driver.findElement(By.id("TaxZoneId"))).selectByVisibleText("Zone - 04,CTG");
	    driver.findElement(By.id("TaxZoneId")).click();
	    driver.findElement(By.id("ddlDistrict")).click();
	    new Select(driver.findElement(By.id("ddlDistrict"))).selectByVisibleText("Dhaka");
	    driver.findElement(By.id("ddlDistrict")).click();
	    Thread.sleep(1500);
	    //driver.findElement(By.id("ddlCityCorporation")).click();
	    //new Select(driver.findElement(By.id("ddlCityCorporation"))).selectByIndex(1);
	    //driver.findElement(By.id("ddlCityCorporation")).click();
	    driver.findElement(By.id("LicenseTypeId")).click();
	    new Select(driver.findElement(By.id("LicenseTypeId"))).selectByVisibleText("NonProfessional");
	    driver.findElement(By.id("LicenseTypeId")).click();
	    driver.findElement(By.id("DrivingLicensePlaceOfIssue")).sendKeys("Dhaka");
	    driver.findElement(By.id("VahicleClassId")).click();
	    new Select(driver.findElement(By.id("VahicleClassId"))).selectByVisibleText("Motorcycle");
	    driver.findElement(By.id("VahicleClassId")).click();
	    driver.findElement(By.id("datepicker-normal5")).sendKeys("31/12/2021"+Keys.ENTER);
	    driver.findElement(By.id("datepicker-normal6")).sendKeys("31/12/2021"+Keys.ENTER);
	    driver.findElement(By.id("file6")).sendKeys("C:\\Users\\tbslaptop\\Desktop\\Upload\\image.jpg");
	    driver.findElement(By.xpath("//input[@value='Save']")).submit();
	    Thread.sleep(1000);
	  }
	@Test(priority=3)
	  public void AddressCreate() throws Exception {
	    driver.findElement(By.id("sidebarCollapse")).click();
	    driver.findElement(By.id("EmpAdrees")).click();
	    driver.findElement(By.id("BlockOrSectorNo")).sendKeys("H");
	    driver.findElement(By.id("RoadOrStreetNo")).sendKeys("8");;
	    driver.findElement(By.id("BuildingOrHouseName")).sendKeys("Mohisin Villa");
	    driver.findElement(By.id("HouseOrVillageNo")).sendKeys("35");
	    driver.findElement(By.id("FlatNo")).sendKeys("6th");
	    driver.findElement(By.id("Area")).sendKeys("Ibrahimpur");
	    driver.findElement(By.id("DivisionId")).click();
	    new Select(driver.findElement(By.id("DivisionId"))).selectByVisibleText("Dhaka");
	    driver.findElement(By.id("DivisionId")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("DistricId")).click();
	    new Select(driver.findElement(By.id("DistricId"))).selectByVisibleText("Dhaka");
	    driver.findElement(By.id("DistricId")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("ThanaId")).click();
	    new Select(driver.findElement(By.id("ThanaId"))).selectByVisibleText("Mirpur");
	    driver.findElement(By.id("ThanaId")).click();
	    driver.findElement(By.id("SameAsPresentAddress")).click();
	    driver.findElement(By.xpath("//input[@value='Save']")).submit();
	    Thread.sleep(1000);
	  }
	@Test(priority=4)
	  public void QualificationCreate() throws Exception {
	    driver.findElement(By.xpath("//a[@id='sidebarCollapse']/i")).click();
	    driver.findElement(By.id("EmployeeQualification")).click();
	    driver.findElement(By.id("DegreeId")).click();
	    new Select(driver.findElement(By.id("DegreeId"))).selectByIndex(1);
	    driver.findElement(By.id("DegreeId")).click();
	    driver.findElement(By.id("EdecutionBoardId")).click();
	    new Select(driver.findElement(By.id("EdecutionBoardId"))).selectByIndex(1);
	    driver.findElement(By.id("EdecutionBoardId")).click();
	    driver.findElement(By.id("Major")).sendKeys("CSE");
	    driver.findElement(By.id("Result")).sendKeys("3.69");
	    driver.findElement(By.id("DurationTypeId")).click();
	    new Select(driver.findElement(By.id("DurationTypeId"))).selectByVisibleText("Years");
	    driver.findElement(By.id("DurationTypeId")).click();
	    driver.findElement(By.id("DurationId")).click();
	    new Select(driver.findElement(By.id("DurationId"))).selectByVisibleText("4");
	    driver.findElement(By.id("DurationId")).click();
	    driver.findElement(By.id("DegreeName")).sendKeys("BSC");
	    driver.findElement(By.id("AllCountryId")).click();
	    new Select(driver.findElement(By.id("AllCountryId"))).selectByVisibleText("Bangladesh");
	    driver.findElement(By.id("AllCountryId")).click();
	    driver.findElement(By.id("Inistitute")).sendKeys("ADUST");
	    driver.findElement(By.id("YearId")).click();
	    new Select(driver.findElement(By.id("YearId"))).selectByVisibleText("2020");
	    driver.findElement(By.id("YearId")).click();
	  driver.findElement(By.xpath("//input[@value='Save']")).submit();
	  Thread.sleep(1000);
	  }
	@Test(priority=5)
	  public void TrainingAndCertificationCreate() throws Exception {
	    driver.findElement(By.xpath("//a[@id='sidebarCollapse']/i")).click();
	    driver.findElement(By.id("EmpTraining")).click();
	    driver.findElement(By.id("Topic")).sendKeys("Web Design");
	    driver.findElement(By.id("DurationTypeId")).click();
	    new Select(driver.findElement(By.id("DurationTypeId"))).selectByVisibleText("Months");
	    driver.findElement(By.id("DurationTypeId")).click();
	    driver.findElement(By.id("DurationId")).click();
	    new Select(driver.findElement(By.id("DurationId"))).selectByVisibleText("3");
	    driver.findElement(By.id("DurationId")).click();
	    driver.findElement(By.id("TrainingTypeId")).click();
	    new Select(driver.findElement(By.id("TrainingTypeId"))).selectByVisibleText("Self");
	    driver.findElement(By.id("TrainingTypeId")).click();
	    driver.findElement(By.id("Inistitute")).sendKeys("Genuity System Limited");
	    driver.findElement(By.id("CountryId")).click();
	    new Select(driver.findElement(By.id("CountryId"))).selectByVisibleText("Bangladesh");
	    driver.findElement(By.id("CountryId")).click();
	    driver.findElement(By.id("YearId")).click();
	    new Select(driver.findElement(By.id("YearId"))).selectByVisibleText("2014");
	    driver.findElement(By.id("YearId")).click();
	  driver.findElement(By.xpath("//input[@value='Save']")).submit();
	  Thread.sleep(1000);
	  }
	
	@Test(priority=6)
	  public void PreviousExperience() throws Exception {
	    driver.findElement(By.id("sidebarCollapse")).click();
	    driver.findElement(By.id("WorkExperience")).click();
	    driver.findElement(By.id("CompanyName")).sendKeys("Jibon Bima Corporation");
	    driver.findElement(By.id("Designation")).sendKeys("Developer");
	    driver.findElement(By.id("Department")).sendKeys("Development");
	    driver.findElement(By.id("datepicker-normal")).sendKeys("01/05/2020"+Keys.ENTER);
	    driver.findElement(By.id("datepicker-normal-DateTo")).sendKeys("01/05/2020"+Keys.ENTER);
	    driver.findElement(By.id("ProjectCompleted")).sendKeys("HSDL");
	    driver.findElement(By.id("ToolsAndTechnologyUsed")).sendKeys(".NET");
	    driver.findElement(By.id("RolesAndResponsibilities")).sendKeys("Analysis and Development");
	  driver.findElement(By.xpath("//input[@value='Save']")).submit();
	  Thread.sleep(1000);
	  }
	@Test(priority=7)
	  public void EmergencyContract() throws Exception {
		driver.findElement(By.id("sidebarCollapse")).click();
	    driver.findElement(By.id("EmergencyContact")).click();
	    driver.findElement(By.id("Name")).sendKeys("Faruk Hossain");
	    driver.findElement(By.id("Relation")).sendKeys("Cousin");
	    driver.findElement(By.id("ContactNo1")).sendKeys("01627558586");
	    driver.findElement(By.id("Email")).sendKeys("faruk@gmail.com");
	    driver.findElement(By.id("Address")).sendKeys("Noahkhali, Bangladesh");
	    driver.findElement(By.xpath("//input[@value='Save']")).submit();
	    Thread.sleep(1000);
	  }
	/*@Test(priority=8)
	  public void SalaryAndFinanceInfo() throws Exception {
	    driver.findElement(By.id("sidebarCollapse")).click();
	    driver.findElement(By.id("BankingInformation")).click();
	    driver.findElement(By.id("EmployeeSalary")).sendKeys("25000");
	    driver.findElement(By.id("PayCycleId")).click();
	    new Select(driver.findElement(By.id("PayCycleId"))).selectByIndex(1);
	    driver.findElement(By.id("PayCycleId")).click();
	    driver.findElement(By.id("CostCenterId")).click();
	    new Select(driver.findElement(By.id("CostCenterId"))).selectByIndex(1);
	    driver.findElement(By.id("CostCenterId")).click();
	  driver.findElement(By.xpath("//input[@value='Save']")).submit();
	  Thread.sleep(1000);
	  }*/
	
	@Test(priority=9)
	  public void UploadDocuments() throws Exception {
	    driver.findElement(By.id("sidebarCollapse")).click();
	    driver.findElement(By.id("UploadDocument")).click();
	    driver.findElement(By.id("FirstFile")).sendKeys("File1");
	    driver.findElement(By.id("file1")).sendKeys("C:\\Users\\tbslaptop\\Desktop\\Upload\\image.jpg");
	    driver.findElement(By.id("SecondFile")).sendKeys("File2");
	    driver.findElement(By.id("file2")).sendKeys("C:\\Users\\tbslaptop\\Desktop\\Upload\\image.jpg");
	  driver.findElement(By.xpath("//input[@value='Save']")).submit();
	  Thread.sleep(1000);
	  }
	
	@Test(priority=10)
	  public void BankingInfo() throws Exception {
	    driver.findElement(By.xpath("//a[@id='sidebarCollapse']/i")).click();
	    driver.findElement(By.id("BankInforamtionDetail")).click();
	    driver.findElement(By.id("AcountName")).sendKeys("Shadat Hossain");
	    driver.findElement(By.id("AcountNumber")).sendKeys("102.302.365.36");
	    driver.findElement(By.id("BankingInforamtionMasterId")).click();
	    new Select(driver.findElement(By.id("BankingInforamtionMasterId"))).selectByIndex(1);
	    driver.findElement(By.id("BankingInforamtionMasterId")).click();
	    driver.findElement(By.id("BranchName")).sendKeys("Banani");
	    driver.findElement(By.id("IsSalaryDisbursment")).click();
	    driver.findElement(By.id("ddlCountry")).click();
	    new Select(driver.findElement(By.id("ddlCountry"))).selectByVisibleText("Bangladesh");
	    driver.findElement(By.id("ddlCountry")).click();
	  driver.findElement(By.xpath("//input[@value='Save']")).submit();
	  Thread.sleep(1000);
	  }
	  @Test(priority=11)
	  public void LoginSetup() throws Exception {
	    driver.findElement(By.id("sidebarCollapse")).click();
	    driver.findElement(By.id("EmployeeEntry")).click();
	    driver.findElement(By.id("UserName")).sendKeys("shadat");
	    driver.findElement(By.id("Password")).sendKeys("123");
	    driver.findElement(By.xpath("//input[@value='Save']")).submit();
	    Thread.sleep(1000);
	  }
	  @Test(priority=12)
	  public void FamilyMembers() throws Exception {
	    driver.findElement(By.xpath("//a[@id='sidebarCollapse']/i")).click();
	    driver.findElement(By.id("FamilyMemberSetup")).click();
	    driver.findElement(By.id("Name")).sendKeys("Rakib");
	    driver.findElement(By.id("DateOfBirth")).sendKeys("05/12/2012"+Keys.ENTER);
	    driver.findElement(By.id("relationddl")).click();
	    new Select(driver.findElement(By.id("relationddl"))).selectByVisibleText("Son");
	    driver.findElement(By.id("relationddl")).click();
	    driver.findElement(By.id("IsLegalGuardian")).click();
	    driver.findElement(By.id("LegalGuardian")).sendKeys("C:\\Users\\tbslaptop\\Desktop\\Upload\\image.jpg");
	    driver.findElement(By.id("PhoneNo")).sendKeys("01627557566");
	    driver.findElement(By.id("Email")).sendKeys("ratil@gmail.com");
	    driver.findElement(By.id("IsDisable")).click();
	    driver.findElement(By.id("StreetName")).sendKeys("8");
	    driver.findElement(By.id("DivisionName")).sendKeys("Chattogram");
	    driver.findElement(By.id("CityName")).click();
	    driver.findElement(By.id("CityName")).clear();
	    driver.findElement(By.id("CityName")).sendKeys("Halishor");
	  driver.findElement(By.xpath("//input[@value='Save']")).submit();
	  Thread.sleep(1000);
	  }
	  @Test(priority=13)
	  public void Nominee() throws Exception {
	    driver.findElement(By.xpath("//a[@id='sidebarCollapse']/i")).click();
	    driver.findElement(By.id("NomineeSetup")).click();
	    driver.findElement(By.id("Name")).sendKeys("Gias Uddin");
	    driver.findElement(By.id("DateOfBirth")).sendKeys("05/12/2012"+Keys.ENTER);
	    driver.findElement(By.id("RelationId")).click();
	    new Select(driver.findElement(By.id("RelationId"))).selectByVisibleText("Father");
	    driver.findElement(By.id("RelationId")).click();
	    driver.findElement(By.id("NID")).sendKeys("659875");
	    driver.findElement(By.xpath("//form[@id='myForm']/div/div")).click();
	    driver.findElement(By.id("PhoneNo")).sendKeys("3658985");
	    driver.findElement(By.id("Email")).sendKeys("ahh@hotmail.com");
	    driver.findElement(By.xpath("//form[@id='myForm']/div/div/div[5]")).click();
	  driver.findElement(By.xpath("//input[@value='Save']")).submit();
	  Thread.sleep(1000);
	  }
	  
	  @AfterTest
		public void Closed(){
			driver.quit();

		}
	

}
