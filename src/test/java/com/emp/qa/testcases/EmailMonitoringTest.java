package com.emp.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmailMonitoringPage;
import com.emp.qa.pages.EmployeeAttendanePage;
import com.emp.qa.pages.HomePage;

public class EmailMonitoringTest extends TestBase {

	@Test
	public void EmailMonitoringTest() throws InterruptedException, AWTException{		
	EmailMonitoringPage Emailmonitor =new EmailMonitoringPage(getDriver());
	HomePage hp=new HomePage(getDriver());		 
	hp.SkipPopup();
	hp.clickEmployee();
	Emailmonitor.EmailMonitoringPage();

	}

}
