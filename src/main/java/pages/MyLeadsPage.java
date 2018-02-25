package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createLead;
	
	public CreateLeadPage clickCreateLead() {
		click(createLead);
		return new CreateLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement clickFindLead;
	
	public FindLeadPage clickFindLead() {
		click(clickFindLead);
		return new FindLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement clickMergeLead;
	
	public MergeLeadPage clickMergeLead() {
		click(clickMergeLead);
		return new MergeLeadPage();		
	}
}
