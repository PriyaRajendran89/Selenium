package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Priya";
		browserName="chrome";
		dataSheetName="TC007";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String eMail,String vName)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLead()
		.clickFromLead()
		
		.clickFindLead()
		.clickEmailTab()
		.enterEmailId(eMail)
		.clickFindLead()
		.clickFirstLead()
		.clickDuplicateLead()
		.clickCreateLead()
		.verifyFirstName(vName);
		
}

}
