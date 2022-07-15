package com.emp.qa.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProductivityRulesPage;
import com.emp.qa.pages.ProjectsPage;

public class ProductivityRulesTest extends TestBase  {
	
	
	@Test
	public void ProductivityRulesTest() throws InterruptedException{
		ProductivityRulesPage productivityrules=new ProductivityRulesPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.ManageLocationsAndDepartmentPage();
		productivityrules.ProductivityRulesPage();
	

}
}

