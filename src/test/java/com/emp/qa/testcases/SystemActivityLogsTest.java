package com.emp.qa.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.SystemActivityLogsPage;
import com.emp.qa.pages.TimeClaimPage;

public class SystemActivityLogsTest extends TestBase{
	
	@Test
	public void SystemActivityLogsTest() throws InterruptedException{
		SystemActivityLogsPage Systemactivity=new SystemActivityLogsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.ReportsDownloadPage();
		Systemactivity.SystemActivityLogsPage();
}
}

