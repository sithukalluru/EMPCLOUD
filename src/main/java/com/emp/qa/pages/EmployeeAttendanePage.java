package com.emp.qa.pages;

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
public class EmployeeAttendanePage extends BasePage {
	
	public EmployeeAttendanePage(WebDriver driver) {
		super(TestBase.getDriver());
		
		
	}
	Helpers helper=new Helpers();	
	
	@FindBy(xpath = "//a[contains(text(),'Employee-Attendance')]")
	@CacheLookup
	WebElement EmployeeAttendance;
	
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement Showentries;
	
	@FindBy(xpath = "//input[@id='EmployeedateOfjoin']")
	@CacheLookup
	WebElement Monthyear;
	
	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='DepartementData']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//button[@id='DownloadButton']")
	@CacheLookup
	WebElement ExportExcel;
	
	@FindBy(xpath = "//a[contains(text(),'DESKTOP-9EVJM5N - Gohar')]")
	@CacheLookup
	WebElement Employeename;
	
	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement productivity;
	
	
	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheets;
	
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
	
	
	
	
	
	
	
	
	
	public void EmployeeAttendance()throws InterruptedException{
		
		helper.waitFor(EmployeeAttendance);
		helper.highLightElement(driver, EmployeeAttendance);
		EmployeeAttendance.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeAttendance");
		Assert.assertTrue(true, "Failed to click on EmployeeAttendance");
		
		helper.highLightElement(driver, Showentries);
		helper.selectDropDownValue(Showentries, "index", "4");
		Showentries.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on ShowEntries_DropDown");
		Assert.assertTrue(true, "Failed to click on ShowEntries_DropDown");
		
		helper.waitFor(Monthyear);
		helper.highLightElement(driver, Monthyear);
		Monthyear.clear();
		Monthyear.sendKeys("05-2021");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Monthyear_DropDown");
		Assert.assertTrue(true, "Failed to send data to Monthyear");
		
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location_DropDown");
		Assert.assertTrue(true, "Failed click on Location_DropDown");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "index", "1");
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Department_DropDown");
		Assert.assertTrue(true, "Failed to click on Department_DropDown");
		
		helper.waitFor(ExportExcel);
		helper.highLightElement(driver, ExportExcel);
		ExportExcel.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on ExportExcel_Button");
		Assert.assertTrue(true, "Failed to click on ExportExcel_Button");
		Thread.sleep(7000);
		
		helper.waitFor(Employeename);
		helper.highLightElement(driver, Employeename);
		Employeename.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> click on Employeename");
		Assert.assertTrue(true, "Failed to click on Employeename");
		
		
		
		helper.waitFor(productivity);
		helper.highLightElement(driver, productivity);
		productivity.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on productivity_Button");
		Assert.assertTrue(true, "Failed to click on productivity_Button");
		
		helper.waitFor(Timesheets);
		helper.highLightElement(driver, Timesheets);
		Timesheets.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> click on Timesheets_Button");
		Assert.assertTrue(true, "Failed to click onTimesheets_Button");
		
		helper.waitFor(Screenshots);
		helper.highLightElement(driver, Screenshots);
		Screenshots.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Screenshots_Button");
		Assert.assertTrue(true, "Failed to click Screenshots_Button");
		
		helper.waitFor(ScreenRecorder);
		helper.highLightElement(driver, ScreenRecorder);
		ScreenRecorder.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on ScreenRecorder_Button");
		Assert.assertTrue(true, "Failed to click on ScreenRecorder_Button");
		
		helper.waitFor(Webhistory);
		helper.highLightElement(driver, Webhistory);
		Webhistory.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on Webhistory_Button");
		Assert.assertTrue(true, "Failed to click on Webhistory_Button");
		
		helper.waitFor(AppHistory);
		helper.highLightElement(driver, AppHistory);
		AppHistory.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on AppHistory_Button");
		Assert.assertTrue(true, "Failed to click on AppHistory_Button");
		
		helper.waitFor(Keystrokes);
		helper.highLightElement(driver, Keystrokes);
		Keystrokes.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on Keystrokes");
		Assert.assertTrue(true, "Failed to click on Keystrokes_Button");
		
		helper.waitFor(Analysis);
		helper.highLightElement(driver, Analysis);
		Analysis.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on Analysis_Button");
		Assert.assertTrue(true, "Failed to click on Analysis_Button");
		
		
	}

	

	

}
