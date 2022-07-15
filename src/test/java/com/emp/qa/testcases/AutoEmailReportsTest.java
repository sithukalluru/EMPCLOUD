package com.emp.qa.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AutoEmailReportsPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProductivityReportsPage;

public class AutoEmailReportsTest extends TestBase {

	@Test
	public void AutoEmailReportsTest() throws InterruptedException{
		AutoEmailReportsPage AutoemailR=new AutoEmailReportsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.ReportsDownloadPage();
		AutoemailR.AutoEmailReportsPage();
	
	
}
}
