package com.emp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollRunpayrollAttendanceandLeavePage;
import com.emp.qa.pages.HrmsPayrollRunpayrollOverviewPage;

public class HrmsPayrollRunpayrollAttendanceandLeaveTest extends TestBase {
	

		
		@Test
		public void HrmsPayrollRunpayrollAttendanceandLeaveTest() throws InterruptedException, IOException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsPayrollRunpayrollAttendanceandLeavePage overviewPage = new HrmsPayrollRunpayrollAttendanceandLeavePage(getDriver());
			homePage.SkipPopup();
			overviewPage.HrmsPayrollRunpayrollAttendanceandLeavePage();
		}



	}
