Feature: Automate TestLeaf Application 

Scenario: TC001 Login and Logout 
	Given launch the Chrome Browse And Load url 
	And enter username as DemoSalesManage 
	And enter password as crmsfa 
	When click the Login Button 
	Then its Navigated Homepage 
	And click the Logout button 
	And close the Browse 
	
