package com.emp.qa.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeDetailspage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RegisterEmployeePage;

public class RegisterEmployeeTest extends TestBase {

	@Test
	public void RegisterEmployeeTest() throws InterruptedException{
		
		HomePage homePage =new HomePage(getDriver());
		RegisterEmployeePage REP=new RegisterEmployeePage(getDriver());
		homePage.SkipPopup();
		homePage.clickEmployee();
		REP.RegisterEmployee();
	}

}
