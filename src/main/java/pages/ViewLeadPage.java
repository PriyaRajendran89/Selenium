package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleFirstName;

	public ViewLeadPage verifyFirstName(String data) {
		//String data=eleFirstName.getText();
		verifyPartialText(eleFirstName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleFName;

	public ViewLeadPage verifyNamesAreSame() {
		String duplicatedLeadName=eleFirstName.getText();
		System.out.println("duplicatedLeadName is" + duplicatedLeadName);
		//verifyPartialText(eleFirstName, data);
		System.out.println("captured name from ViewLeadPage" + FindLeadPage.capturedName );
		if(duplicatedLeadName.equalsIgnoreCase(FindLeadPage.capturedName))
			System.out.println("Names are same");
		else {
			System.out.println("Names are not same");}
		return this;
	}

	@FindBy(how = How.ID, using = "viewLead_lastName_sp")
	private WebElement eleLastName;

	public ViewLeadPage verifyLastName(String data) {
		verifyPartialText(eleLastName, data);
		return this;
	}

	// Click Edit lead Button
	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement eleEditButton;

	public EditLeadPage clickEdit() {
		click(eleEditButton);
		return new EditLeadPage();
	}

	// Click Delete Button
	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement eleDelButton;

	public MyLeadsPage clickDelete() {
		click(eleDelButton);
		return new MyLeadsPage();
	}

	// Click Duplicate Lead Button
	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement eleDupButton;

	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDupButton);
		return new DuplicateLeadPage();
	}
}
