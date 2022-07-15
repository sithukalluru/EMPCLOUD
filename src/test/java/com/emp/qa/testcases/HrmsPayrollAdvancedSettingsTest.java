package com.emp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollAdvancedSettingsPage;
import com.emp.qa.pages.HrmsPayrollDeclarationOtherincomeOtherthanSavingPage;

public class HrmsPayrollAdvancedSettingsTest extends TestBase {
	
	@Test
	public void HrmsPayrollAdvancedSettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsPage AdvancedSettings = new HrmsPayrollAdvancedSettingsPage(getDriver());
		homePage.SkipPopup();
		AdvancedSettings.HrmsPayrollAdvancedSettingsPage();
	}

}
