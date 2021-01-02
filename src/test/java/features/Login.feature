Feature: Appilication Login 


Scenario: Home page default login 
	Given user is on landing page 
	When user login into application with username "Tom" and password "00111" 
	Then Home page is populated 
	And Cards are displayed "true"
	
Scenario: Home page default login 
	Given user is on landing page 
	When user login into application with username "Hari" and password "10101" 
	Then Home page is populated 
	And Cards are displayed "false"
	
	
