package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLeadPage extends ProjectSpecificWrapper{
	
	
	//Enter Company Name
	public CreateLeadPage enterComName(String cName) {
		enterByXpath("//input[@id=\"createLeadForm_companyName\"]", cName);
		return this;
	}
	
	
	//F & L Nam
	public CreateLeadPage enterFname(String fName) {
		enterByXpath("//input[@id=\"createLeadForm_firstName\"]", fName);
		return this;
	}

	public CreateLeadPage enterLName(String lName) {
		enterById("createLeadForm_lastName", lName);
		return this;
	}
	
	//Choose Source
	public CreateLeadPage selectWeb() {
		selectVisibileTextById("createLeadForm_dataSourceId", "Website");
		return this;
	}
	
	
	
	public CreateLeadPage enterPhoneNumber(String phoneNumber) {
		enterByXpath("//input[@id=\"createLeadForm_primaryPhoneNumber\"]", phoneNumber);
		return this;
	}
	
	public CreateLeadPage enterEmail(String eMail) {
		enterByXpath("//input[@id=\"createLeadForm_primaryEmail\"]", eMail);
		return this;
	}
	
	
	//Create Lead
	public ViewLeadPage clickCreateLead() {
			clickByXpath("//input[@class=\"smallSubmit\"]");
			return new ViewLeadPage();
		}
		

}
