package com.emp.qa.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.UseOfTheWebApplicationPage;
import com.emp.qa.pages.WebsiteandApplicationPage;

public class WebsiteandApplicatonTest extends TestBase{
	
	

	@Test
	public void WebsiteandApplicatonTest() throws InterruptedException{
		WebsiteandApplicationPage WebApp=new WebsiteandApplicationPage(getDriver());
	HomePage homePage =new HomePage(getDriver());
	homePage.SkipPopup();
	homePage.ReportsDownloadPage();
	WebApp.WebsiteandApplicationPage();

}
	

}
