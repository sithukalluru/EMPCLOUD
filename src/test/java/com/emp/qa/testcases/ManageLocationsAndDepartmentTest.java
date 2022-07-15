package com.emp.qa.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ManageLocationsAndDepartmentPage;
import com.emp.qa.pages.StorageTypePage;
import com.emp.qa.pages.UseOfTheWebApplicationPage;


public class ManageLocationsAndDepartmentTest extends TestBase{
	
	@Test
	public void ManageLocationsAndDepartmentTest() throws InterruptedException{
	ManageLocationsAndDepartmentPage ManageLocations=new ManageLocationsAndDepartmentPage(getDriver());
	HomePage homePage =new HomePage(getDriver());
	homePage.SkipPopup();
	homePage.ManageLocationsAndDepartmentPage();
	ManageLocations.ManageLocationsAndDepartmentPage();
}
}

