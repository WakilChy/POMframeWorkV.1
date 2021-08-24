package pages;

import wrapper.ProjectSpecificWrapper;

public class MyHomePage extends ProjectSpecificWrapper {
	
	public MyLeadsPage clickLeads() {
		clickByLinkText("Leads");
		return new MyLeadsPage();
	}

}
