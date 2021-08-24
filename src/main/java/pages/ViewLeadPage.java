package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper {
	
		
	public ViewLeadPage varifyTitle() {
		verifyTitle("View Lead");
		return this;
	}
	
	public void varifyName(String fName) {
		verifyTextById("viewLead_firstName_sp", fName);
	}
	
	public EditLeadPage clickEdit() {
		clickByXpath("//a[text()='Edit']");
		return new EditLeadPage();
	}
	
	public ViewLeadPage verifyCompanyName(String cName) {
		verifyTextContainsByXpath("//span[@id=\"viewLead_companyName_sp\"]", cName);
		return this;
	}
	
	public ViewLeadPage clickDelete() {
		clickByLinkText("Delete");
		return this ;
	}

}
