package com.emp.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.BulkUpdatePage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RegisterEmployeePage;

public class BulkUpdateTest extends TestBase {
	
	
	@Test
	public void BulkUpdateTest() throws InterruptedException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		BulkUpdatePage Bulk=new BulkUpdatePage(getDriver());
		homePage.SkipPopup();
		homePage.clickEmployee();
		//empDpage	.EmployeeDetails();
		Bulk.BulkUpdate();
		

}
}

