package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeadsPage extends ProjectSpecificWrapper {
	
	public CreateLeadPage clickCreateLead() {
		clickByLinkText("Create Lead");
		return new CreateLeadPage();
	}
	
	
	
	
	public FindLeadsPage clickFindLead() {
		clickByLinkText("Find Leads");
		
		return new FindLeadsPage();
		
	}

}
