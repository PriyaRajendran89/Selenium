package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {

	public static String capturedName = null;

	public FindLeadPage() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	public FindLeadPage enterFirstName(String data) {	
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='lastName'])[3]")
	private WebElement eleLastName;
	
	public FindLeadPage enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	//Click Email Tab
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailTab;
	
	public FindLeadPage clickEmailTab()
	{
		click(eleEmailTab);
		return this;
	}
	
	//Type EmailId
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEmailId;
	
	public FindLeadPage enterEmailId(String data) {
		type(eleEmailId, data);
		return this;
	}
	
	//Click Find Leads Button
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleClickFindLead;
	
	public FindLeadPage clickFindLead() {
		click(eleClickFindLead);
		return this;		
	}
	
	//No records to display
	@FindBy(how=How.XPATH,using="//div[text()[contains(.,'No records to display')]]")
	private WebElement eleVerNoRec;
	
	public FindLeadPage verifyNoRec(String data) {
		verifyPartialText(eleVerNoRec, data);
		return this;		
	}
	
	//Click First Resulting Lead
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleClickFirstLead;
	
	public ViewLeadPage clickFirstLead() {
		capturedName=eleClickFirstLead.getText();
		System.out.println("capturedName from FindLeadPage" + capturedName);
		click(eleClickFirstLead);
		return new ViewLeadPage();		
	}
}
