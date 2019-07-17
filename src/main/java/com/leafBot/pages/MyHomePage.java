package com.leafBot.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class MyHomePage extends Annotations {
	
	public MyHomePage() {
		
		PageFactory.initElements(driver, this);
	}
  
	//@FindBy(how=How.XPATH, using="//a[text()='Leads']" ) WebElement eleleadtabs;
	
	public MyLeadPage clickLeadTabs() {
	  WebElement eleleadtabs= locateElement("XPATH","//a[text()='Leads']");
		click(eleleadtabs);
		return new MyLeadPage(); 
	}

	}
