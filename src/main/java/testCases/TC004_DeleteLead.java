package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC004_DeleteLead extends ProjectSpecificWrapper {
	
	@BeforeTest
	public void setData() {
		excelfile="TC004_DeleteLead";
	}
	
	
	
	
	@Test(dataProvider = "getData")
	public void TCDeleteLead(String uName,String pwd ,String fName) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		
		.clickFindLead()
		
		//.clickPhoneButton()
		//.enterPhoneNumber()
		.enterFirstName(fName)
		.clickFindLeadSearch()
		.clickFirstLead()	
		.clickDelete();
		Thread.sleep(3000);
		
		
		
		
	}

}
