package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {
	
	public  MergeLeadPage()
	{
		
		PageFactory.initElements(driver,this);
	}

	//Click From Lead image
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLead;
	
	public MergeLeadPage clickFromLead()
	{
		click(eleFromLead);
		switchToWindow(1);
		return this;
	}


    //Selecting first link
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstLink;
	
	public MergeLeadPage clickFirstLink()
	{
		clickWithNoSnap(eleFirstLink);
		return this;
	}


	//Click To Lead image
		@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
		private WebElement eleToLead;
		
		public MergeLeadPage clickToLead()
		{
			click(eleToLead);
			return this;
		}



}
