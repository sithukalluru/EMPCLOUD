package com.emp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashBoardPage;
import com.emp.qa.pages.HrmsPayrollAdvacedSettingsDeclarationSettingsPage;

public class HrmsEmployeeDashBoardTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashBoardTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashBoardPage HrmsEmployee = new HrmsEmployeeDashBoardPage(getDriver());
		HrmsEmployee.HrmsEmployeeDashBoardPage();
	}
	
	

}
