package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC004";
	}

	
	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String fName,String lName,String newLName)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickFindLead()
		.clickFirstLead()
		.clickEdit()
		.updateLastName(newLName)
		.clickUpdate()
		.verifyLastName(newLName);
		
}

}