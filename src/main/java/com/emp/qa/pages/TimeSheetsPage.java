package com.emp.qa.pages;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

@Listeners(ITestNGListener.class)
public class TimeSheetsPage extends BasePage {

	public  TimeSheetsPage(WebDriver driver) {
		super(TestBase.getDriver());
	
	
}
	Helpers helper=new Helpers();
	//Xls_Reader excel = new Xls_Reader("C:\\Users\\Official\\Downloads\\Attendance History (47).xlsx");
	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement selectdateranges;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;
	
	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days;
	
	@FindBy(xpath = "(//a[@title='View Full Details'][contains(.,'GLB-110-PC - GLB-110')])[1]")
	@CacheLookup
	WebElement Name;
	
	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement productivity;
	
	
	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheets_Btn;
	
	@FindBy(xpath = "//a[@id='ScreenshotsTab']")
	@CacheLookup
	WebElement Screenshots;
	
	@FindBy(xpath = "//a[@id='ScreenRecordingTab']")
	@CacheLookup
	WebElement ScreenRecorder;
	
	@FindBy(xpath = "//a[@id='BrowserHistoryTab']")
	@CacheLookup
	WebElement Webhistory;
	
	@FindBy(xpath = "//a[@id='AppHistoryTab']")
	@CacheLookup
	WebElement AppHistory;
	
	@FindBy(xpath = "//a[@id='keyLoggerTab']")
	@CacheLookup
	WebElement Keystrokes;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/a[8]")
	@CacheLookup
	WebElement Analysis;
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;
	
	@FindBy(xpath = "//button[@id='download_btn']")
	@CacheLookup
	WebElement PDF;
	
	
	

	
	public void TimeSheetsPage()throws InterruptedException, IOException{
		
		
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B>Selected Banglore from the loction Dropdown");
		Assert.assertTrue(true, "Failed to Select a value from the Locaton Drpdown");
		

		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "1");
		//Department.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Department dropdown");
		Assert.assertTrue(true, "Failed to Select Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.selectDropDownValue(Employee, "value", "0");
		//Employee.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Employee dropdown");
		Assert.assertTrue(true, "Failed to Select Employee");
		
		helper.waitFor(selectdateranges);
		helper.highLightElement(driver, selectdateranges);
		//helper.selectDropDownValue(Date, "visibletext", "Yesterday");
		selectdateranges.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on selectdateranges");
		Assert.assertTrue(true, "Failed toselectdateranges");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		//helper.selectDropDownValue(Date, "visibletext", "Yesterday");
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Last30days");
		Assert.assertTrue(true, "Failed to select Last30days");
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on CSV Button");
		Assert.assertTrue(true, "Failed to click on CSV Button");
		
		helper.waitFor(selectall);
		helper.highLightElement(driver, selectall);
		selectall.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Select All check Box");
		Assert.assertTrue(true, "Failed to click on selectall Check Box");
		
		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Thread.sleep(3000);
		helper.jsCLick(Submit);
		//Submit.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		Thread.sleep(58000);
		
		
		         String sheetName = "Attendance History 2021-05-12";
			
			//	System.out.println(reader.getCellData(sheetName, "username", 3));
//				int data = excel.getRowCount(sheetName);
//				System.out.println("The number of columns in the Sheet is:"   +data);
		         
		         
		         
			
//				String A1=excel.getCellData(sheetName, 0, 1);
//				System.out.println("A1"+A1);
//				String A2=excel.getCellData(sheetName, 1, 1);
//				System.out.println(A2);
//				String A3=excel.getCellData(sheetName, 2, 1);
//				System.out.println(A3);
//				String A4=excel.getCellData(sheetName, 3, 1);
//				System.out.println(A4);
//				String A5=excel.getCellData(sheetName, 4, 1);
//				System.out.println(A5);
//				String A6=excel.getCellData(sheetName, 5, 1);
//				System.out.println(A6);
//				String A7=excel.getCellData(sheetName, 6, 1);
//				System.out.println(A7);
//				String A8=excel.getCellData(sheetName, 7, 1);
//				System.out.println(A8);
//				String A9=excel.getCellData(sheetName, 8, 1);
//				System.out.println(A9);
				
//			String s1=	excel.readExcel("Attendance History (47)", "Attendance History 2021-05-12");
//			System.out.println(s1);
			

//			 try {
//				String cell =excel.readExcel("Attendance History (47)", sheetName);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			 int S1=excel.getRowvalues(sheetName, cellcount);
//			 System.out.println(S1);         
//			 
//		  int S2= excel.getRowvalues(sheetName, 0,0);
//		  System.out.println(S2);
////////		  
////		    String s1= excel.IterateRow(sheetName);    
////			  System.out.println(s1);
////			  
//			  
//			  
//			  
//			int rowcount = excel.getRowCount(sheetName);
//			System.out.println("The number of rows in the Sheet is:"  + rowcount);
//			int columncount=excel.getColumnCount(sheetName);
//			System.out.println("The number of columns  in the Sheet is:"  + columncount);
		
		helper.waitFor( PDF);
		helper.highLightElement(driver,  PDF);
		helper.Scrollintoview(PDF);
		helper.jsCLick(PDF);
		//PDF.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on PDF Button");
		Assert.assertTrue(true, "Failed to click on PDF Button");
		
		helper.waitFor(selectall);
		helper.highLightElement(driver, selectall);
		helper.jsCLick(selectall);
		//selectall.click();
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> clicked on select All CheckBox ");
		Assert.assertTrue(true, "Failed to click on selectall CheckBox");
		
		
		
		helper.waitFor(Submit);
		helper.Scrollintoview(Submit);
		helper.highLightElement(driver, Submit);
		helper.jsCLick(Submit);
		//Submit.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		Thread.sleep(48000);
		
		
         
		
		
		helper.waitFor( Name);
		helper.highLightElement(driver, Name);
		 Name.click();
		Reporter.log("<B><font color = 'blue'> Step12.</font></B> clicked on Name");
		Assert.assertTrue(true, "Failed to clicke on Name");
		
		helper.waitFor(productivity);
		helper.highLightElement(driver, productivity);
		productivity.click();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on productivity Button");
		Assert.assertTrue(true, "Failed to click on productivity Button");
		
		helper.waitFor(Timesheets_Btn);
		helper.highLightElement(driver, Timesheets_Btn);
		Timesheets_Btn.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on Timesheets_Btn");
		Assert.assertTrue(true, "Failed to clicke onTimesheets_Btn");
		
		helper.waitFor(Screenshots);
		helper.highLightElement(driver, Screenshots);
		Screenshots.click();
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on Screenshots Button");
		Assert.assertTrue(true, "Failed to clicke on Screenshots Button");
		
		helper.waitFor(ScreenRecorder);
		helper.highLightElement(driver, ScreenRecorder);
		ScreenRecorder.click();
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on ScreenRecorder Button");
		Assert.assertTrue(true, "Failed to clicke on ScreenRecorder Button");
		
		helper.waitFor(Webhistory);
		helper.highLightElement(driver, Webhistory);
		Webhistory.click();
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> clicked on Web History Button");
		Assert.assertTrue(true, "Failed to clicke on Web History Button");
		
		helper.waitFor(AppHistory);
		helper.highLightElement(driver, AppHistory);
		AppHistory.click();
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> clicked on AppHistory Button");
		Assert.assertTrue(true, "Failed to click on AppHistory Button");
		
		helper.waitFor(Keystrokes);
		helper.highLightElement(driver, Keystrokes);
		Keystrokes.click();
		Reporter.log("<B><font color = 'blue'>Step20.</font></B> click on Keystrokes Button");
		Assert.assertTrue(true, "Failed to click on Keystrokes Button");
		
		helper.waitFor(Analysis);
		helper.highLightElement(driver, Analysis);
		Analysis.click();
		Reporter.log("<B><font color = 'blue'>Step21.</font></B> clicked on Analysis Button");
		Assert.assertTrue(true, "Failed to click on Analysis Button");
//		driver.navigate().back();
//		driver.navigate().refresh();
//		
		
		

		
		
//		helper.waitFor(selectdateranges);
//		helper.highLightElement(driver, selectdateranges);
//		helper.waitFor(Yesterday);
//		helper.highLightElement(driver, Last7days);
//		//helper.selectDropDownValue(Date, "visibletext", "Yesterday");
//		Last7days.click();
//		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on Last7days");
//		Assert.assertTrue(true, "Failed to select Last7days");
		
//		helper.waitFor(selectdateranges);
//		helper.highLightElement(driver, selectdateranges);
//		//helper.selectDropDownValue(Date, "visibletext", "Yesterday");
//		selectdateranges.click();
//		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on select date ranges");
//		Assert.assertTrue(true, "Failed to select date ranges");
//		
	
		
		
		
		
		
//		helper.waitFor(CSV);
//		helper.highLightElement(driver, CSV);
//		CSV.click();
//		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clicked on CSV Button");
//		Assert.assertTrue(true, "Failed to click on CSV Button");
//		
//		helper.waitFor(selectall);
//		helper.highLightElement(driver, selectall);
//		selectall.click();
//		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on Select All check Box");
//		Assert.assertTrue(true, "Failed to click on selectall Check Box");
//		
//		helper.waitFor(Submit);
//		helper.highLightElement(driver, Submit);
//		Submit.click();
//		Reporter.log("<B><font color = 'blue'>Step18.</font></B> clicked on Submit Button");
//		Assert.assertTrue(true, "Failed to click on Submit Button");
//		Thread.sleep(5000);
//		
//		helper.waitFor( PDF);
//		helper.highLightElement(driver,  PDF);
//		 PDF.click();
//		Reporter.log("<B><font color = 'blue'>Step19.</font></B> clicked on PDF Button");
//		Assert.assertTrue(true, "Failed to click on PDF Button");
//		
//		helper.waitFor(selectall);
//		helper.highLightElement(driver, selectall);
//		selectall.click();
//		Reporter.log("<B><font color = 'blue'>Step20.</font></B> clicked on select All CheckBox ");
//		Assert.assertTrue(true, "Failed to click on selectall CheckBox");
//		
//		
//		
//		helper.waitFor(Submit);
//		helper.Scrollintoview(Submit);
//		helper.highLightElement(driver, Submit);
//		Submit.click();
//		Reporter.log("<B><font color = 'blue'>Step21.</font></B> clicked on Submit Button");
//		Assert.assertTrue(true, "Failed to click on Submit Button");
//		Thread.sleep(8000);
//		
		
	}
}

