package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods
{

	public EditLeadPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@name='lastName'])[3]")
	private WebElement eleUpdateLastName;
	
	public EditLeadPage updateLastName(String data) {
		type(eleUpdateLastName, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//input[@name='submitButton'])[1]")
	private WebElement eleUpdateButton;
	
	public ViewLeadPage clickUpdate() {
		click(eleUpdateButton);
		return new ViewLeadPage();		
	}	
	
}
