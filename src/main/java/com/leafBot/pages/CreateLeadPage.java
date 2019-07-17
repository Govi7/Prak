package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations {
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName") WebElement elecompanyname;
	@FindBy(how=How.ID, using="createLeadForm_firstName") WebElement elefirstname;
	@FindBy(how=How.ID, using="createLeadForm_lastName") WebElement eleLastname;
	
	public CreateLeadPage typeComapnyName(String data) {
		clearAndType(elecompanyname, data);  
		return this; 	
	}
	
	public CreateLeadPage typeFirstName(String data) {
		clearAndType(elefirstname, data);  
		return this; 	
	}
	
	public CreateLeadPage typeLastName(String data) {
		clearAndType(eleLastname, data);  
		return this; 	
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		
		//@FindBy(how=How.XPATH)
		WebElement eleclbutton=locateElement("XPATH","//input[@name='submitButton']");		
		click(eleclbutton);
		return new ViewLeadPage();
		
		
		
		
	}
	

}
