package com.emp.qa.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TrackUserSettingsFixedPage;
import com.emp.qa.pages.TrackUserSettingsPage;

public class TrackUserSettingsFixedTest extends TestBase {
	@Test
	public void TrackUserSettingsTest() throws InterruptedException{
		
		HomePage homePage =new HomePage(getDriver());
		TrackUserSettingsFixedPage Trackuser = new TrackUserSettingsFixedPage(getDriver());
		homePage.SkipPopup();
		homePage.clickEmployee();
		Trackuser.TrackUserSettings();
	}

}
