package com.emp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsDashBoardPage;

public class HrmsEmployeeBasicDetailsTest extends TestBase {
	@Test
	public void HrmsEmployeeBasicDetailsPage() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		com.emp.qa.pages.HrmsEmployeeBasicDetailsPage HrmsEmployeeBasicDetailsPage = new com.emp.qa.pages.HrmsEmployeeBasicDetailsPage(getDriver());
		homePage.SkipPopup();
		HrmsEmployeeBasicDetailsPage.HrmsEmployeeBasicDetailsPage();
	}

}
