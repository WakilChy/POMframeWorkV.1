package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsPage extends ProjectSpecificWrapper{
	
	
	public FindLeadsPage clickFindLead() {
		clickByLinkText("Find Leads");
		return this ;
	}
	
	public FindLeadsPage enterFirstName(String fName) {
		enterByXpath("//input[@id=\"ext-gen248\"]", fName);
		return this;
	}
	
	public FindLeadsPage clickPhoneButton() {
		clickByLinkText("Phone");
		return this;
	}
	
	public FindLeadsPage enterPhoneNumber() {
		enterByXpath("//input[@name=\"phoneNumber\"]", "123000");
		return this;
	}
	
	public FindLeadsPage clickFindLeadSearch() {
		clickByXpath("(//button[@type=\"button\"])[7]");
		return this;
	}
	
	
	public ViewLeadPage clickFirstLead() {
		
		clickByLinkText("10187"); //Lead change everytime 
		return new ViewLeadPage();
		}
	
	

}
