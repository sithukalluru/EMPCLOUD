package com.emp.qa.pages;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
@Listeners(ITestNGListener.class)
public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(TestBase.getDriver());
	}

	Helpers helper=new Helpers();	


	@FindBy(xpath = "//a[contains(.,'Dashboard')]")
	@CacheLookup
	WebElement DashBoard;

	@FindBy(xpath="//div/a[@class='introjs-skipbutton']")
	WebElement SkipPopUP;
	

	@FindBy(xpath="//button[@id='yesterdayProEmp']")
	WebElement Yesterday;
	

	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement Employee;
	
	@FindBy(xpath="//span[contains(.,'Timesheets')]")
	WebElement Timesheets;
	
	@FindBy(xpath="//a[contains(.,'Time Claim')]")
	WebElement TimeClaim;
	
	@FindBy(xpath="//span[contains(text(),'Projects')]")
	WebElement Projects;
	
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[1]")
	WebElement Reports;
	
	@FindBy(xpath="//a[contains(text(),'System Activity Logs')]")
	WebElement SystemActivityLogs;
	

	@FindBy(xpath="//i[@title='Settings']")
	WebElement Settings;
	
	@FindBy(xpath="//span[contains(text(),'Behaviour')]")
	WebElement Behaviour;
	
	public void SkipPopup( ) {
		try {
		helper.waitFor(SkipPopUP);
		helper.highLightElement(driver, SkipPopUP);
		helper.jsCLick(SkipPopUP);
		helper.waitForpage();
		}catch(Exception e) {
			System.out.println("Skip pop is not Dislayed");
		}
		
}
	public void clickDashboard() throws InterruptedException {
		
		
		
		
		
		
		helper.waitFor(DashBoard);
		helper.highLightElement(driver, DashBoard);
		DashBoard.click();
		//Thread.sleep(5000);
		
		
		
		
		
	}

	
	public void clickEmployee() throws InterruptedException {

	helper.waitForpage();
	helper.waitFor(Employee);
	helper.highLightElement(driver, Employee);
	Employee.click();
	
	
	
	}
	
	public void TimeSheets()throws InterruptedException{
		helper.waitForpage();
		helper.waitFor(Timesheets);
		helper.highLightElement(driver,Timesheets);
		Timesheets.click();
	
	
	}
	
	
	
	
	public void TimeClaim()throws InterruptedException{
		helper.waitForpage();
		helper.waitFor(TimeClaim);
		helper.highLightElement(driver, TimeClaim);
		TimeClaim.click();
		
	}

	public void ProjectsPage()throws InterruptedException{
		helper.waitForpage();
		helper.waitFor(Projects);
		helper.highLightElement(driver, Projects);
		
		
		
		
			
		
		Projects.click();
	
	
}
	public void ReportsDownloadPage()throws InterruptedException{
		helper.waitForpage();
		helper.waitFor(Reports);
		helper.highLightElement(driver, Reports);
		Reports.click();
	
	
	
}
	
	public void SystemActivityLogsPage()throws InterruptedException{
		helper.waitForpage();
		helper.waitFor(SystemActivityLogs);
		helper.highLightElement(driver, SystemActivityLogs);
		SystemActivityLogs.click();
	
	
}
	public void ManageLocationsAndDepartmentPage()throws InterruptedException{
		helper.waitForpage();
		helper.waitFor(Settings);
		helper.highLightElement(driver, Settings);
		Settings.click();
	
}
	public void behaviourpage()throws InterruptedException{
		
		helper.waitForpage();
		helper.waitFor(Behaviour);
		helper.highLightElement(driver, Behaviour);
		Behaviour.click();
		
	}
	
}




