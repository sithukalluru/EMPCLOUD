package com.emp.qa.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ManageLocationsAndDepartmentPage;
import com.emp.qa.pages.StorageTypePage;

public class StorageTypeTest extends TestBase{
	
	@Test
	public void StorageTypeTest() throws InterruptedException{
	StorageTypePage StorageType=new StorageTypePage(getDriver());
	HomePage homePage =new HomePage(getDriver());
	homePage.SkipPopup();
	homePage.ManageLocationsAndDepartmentPage();
	StorageType.StorageTypePage();

}
}


