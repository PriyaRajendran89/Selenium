package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Priya";
		browserName="chrome";
		dataSheetName="TC006";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String eMail)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.clickEmailTab()
		.enterEmailId(eMail)
		.clickFindLead()
		.clickFirstLead()
		.clickDuplicateLead()
		.clickCreateLead()
		//.verifyFirstName();
		.verifyNamesAreSame();
		
}

}
