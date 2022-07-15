package com.emp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsAttendanceOverridePage;
import com.emp.qa.pages.HrmsAttendannceViewPage;

public class HrmsAttendannceViewTest extends TestBase {
	
	@Test
	public void HrmsAttendanceOverrideTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsAttendannceViewPage HrmsAttendview = new HrmsAttendannceViewPage(getDriver());
		homePage.SkipPopup();
		HrmsAttendview.HrmsAttendannceViewPage();
	}


}
