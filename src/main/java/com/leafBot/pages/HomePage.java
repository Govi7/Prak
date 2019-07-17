package com.leafBot.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class HomePage extends Annotations{ 
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	/*public HomePage() {
       PageFactory.initElements(driver, this);
	} 
*/
//	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	/*public LoginPage clickLogout() {
		WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();
	}
	*/
	public MyHomePage clickcrmsfa() {
		//@findBy(how=How.XPATH, using="//a[contains(text(),'CRM/SFA')]") 
		WebElement elecrmsfa=locateElement("XPATH","//a[contains(text(),'CRM/SFA')]");
		click(elecrmsfa);
		return new MyHomePage();
		
		
	}

}







