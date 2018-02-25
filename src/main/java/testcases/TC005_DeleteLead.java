package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Priya";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String eMail,String noRec)
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
		.clickDelete()
		.clickFindLead()
		.clickEmailTab()
		.enterEmailId(eMail)
		.clickFindLead()
		.verifyNoRec(noRec);
		
}

}
