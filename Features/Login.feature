Feature: Login

Scenario: Successful Compose Mail
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And User enter To as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And User Click on Send Button
	And close browser
	
Scenario: Successful Compose Mail with CC and BCC
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And User enter To as "example@gmail.com"
	And User enter cc as "example@gmail.com"
	And User enter bcc as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And User Click on Send Button
	And close browser
	
Scenario: Successful Compose Mail in Full Screen Mode 
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And Maximize the Compose Box
	And User enter To as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And User Click on Send Button
	And close browser
	
Scenario: Successful Compose Mail By Using Menu Functions 
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And User enter To as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And Undo the Task
	And Add Bold Function
	And Add Underline Function
	And Add Italic Function
	And User enter body as "Automation QA Test for Incubyte"
	And User Click on Send Button
	And close browser

Scenario: Successful Compose Mail By Using Other Menu Functions
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And User enter To as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for "
	And Add Hyperlink as text as "Incubyte " and url as "https://mail.google.com/"
	And Add Emoji
	And User Click on Send Button
	And close browser
	
Scenario: Successful Sending 2 Compose Mail 
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And User Click on Compose Button
	And User enter To as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And User Click on Send Button
	And User enter Recipient as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And User Click on Send Button
	And close browser
	
Scenario: Unsuccessful Compose Mail By Closing Compose Box 
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And Close the Compose Box
	And User enter To as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And User Click on Send Button
	And close browser
	
Scenario: Unsuccessful Compose Mail By Minimizing Compose Function 
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And Minimize the Compose Box
	And User enter To as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And User Click on Send Button
	And close browser

	
Scenario: Unsuccessful Compose Mail By Discarding Draft 
	Given User Launch Chrome browser
	When User opens URL "https://mail.google.com/"
	And User enter Email as "test@nirmauni.ac.in"
	And Click on Next
	And User enter Password as "test@123"
	And Click on Nextt
	Then User Click on Compose Button
	And User enter To as "example@gmail.com"
	And User enter subject as "Incubyte"
	And User enter body as "Automation QA Test for Incubyte"
	And Clicking on Discard Draft
	And User Click on Send Button
	And close browser