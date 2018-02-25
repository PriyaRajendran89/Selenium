package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickCreateLead;
	
	public ViewLeadPage clickCreateLead() {
		click(eleClickCreateLead);
		return new ViewLeadPage();		
	}
	
}