package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC003_EditLead extends ProjectSpecificWrapper {
	
	@BeforeTest
	public void setData() {
		excelfile="TC001_EditLead";
	}
	
	
	
	@Test(dataProvider = "getData")
	public void editLead(String uName,String pwd,String fName,String cName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		
		
		.enterFirstName(fName)
		.clickFindLeadSearch()
		
		.clickFirstLead()
		.varifyTitle()
		
		.clickEdit()
		.enterCompanyName(cName)
		
		.clickUpdate()
		.verifyCompanyName(cName);
		
		
		
	}
	

}
