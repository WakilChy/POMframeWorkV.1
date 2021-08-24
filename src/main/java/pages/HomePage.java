package pages;

import wrapper.ProjectSpecificWrapper;

public class HomePage extends ProjectSpecificWrapper{
	
	public MyHomePage clickCRMSFA() {
		clickByLinkText("CRM/SFA");
		
		return new MyHomePage();
	}
	
	
	
	
	
	public LoginPage clickLogOut() {
		clickByXpath("//input[@value=\"Logout\"]");
		return new LoginPage();
	}

}
