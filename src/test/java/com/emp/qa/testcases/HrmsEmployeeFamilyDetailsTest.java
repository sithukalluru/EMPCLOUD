package com.emp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsDashBoardPage;
import com.emp.qa.pages.HrmsEmployeeFamilyDetailsPage;

public class HrmsEmployeeFamilyDetailsTest extends TestBase {
	
	@Test
	public void HrmsEmployeeFamilyDetailsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeFamilyDetailsPage FamilyDetails = new HrmsEmployeeFamilyDetailsPage(getDriver());
		homePage.SkipPopup();
		FamilyDetails.HrmsEmployeeFamilyDetailsPage();
	}


}
