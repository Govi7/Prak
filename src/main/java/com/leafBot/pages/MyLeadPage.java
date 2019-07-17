package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class MyLeadPage extends Annotations {
	
	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CreateLeadPage  clickCreateLead() {
		WebElement elecreatelead=locateElement("XPATH","//a[contains(text(),'Create Lead')]");
		click(elecreatelead);
		return new CreateLeadPage();
		
		
	}
}
