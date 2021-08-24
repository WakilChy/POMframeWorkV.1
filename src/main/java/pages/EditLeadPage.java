package pages;

import wrapper.ProjectSpecificWrapper;

public class EditLeadPage extends ProjectSpecificWrapper {
	
	public EditLeadPage enterCompanyName(String cName) {
		driver.findElementByXPath("//input[@id=\"updateLeadForm_companyName\"]").clear();
				
		enterByXpath("//input[@id=\"updateLeadForm_companyName\"]", cName);
		return this ;
	}
	
	
	public ViewLeadPage clickUpdate() {
		clickByXpath("(//input[@name=\"submitButton\"])[1]");
		return new ViewLeadPage();
	}

}
