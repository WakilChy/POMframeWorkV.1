package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ViewLeadPage;
import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper {
	
	
	@BeforeTest
	public void setData() {
		excelfile="TC002_CreateLead";
	}
	
	
	
	@Test(dataProvider = "getData")
	public void createLead(String uName,String pwd,String cName,String fName,String lName,String eMail ) throws InterruptedException {
		
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		
		
		.enterComName(cName)
		.enterFname(fName)
		.enterLName(lName)
		.selectWeb()
		//.enterPhoneNumber(phoneNumber)
		.enterEmail(eMail)
		
		.clickCreateLead();
		
		Thread.sleep(2000);
		
		new ViewLeadPage()
		.varifyName(fName);
		
		
	}
	

}
