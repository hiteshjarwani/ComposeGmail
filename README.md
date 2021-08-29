# ComposeGmail

Compose Gmail Project is a Test Automation Project on Gmail's Compose Function.
It checks all the possible Test Scenarios in BDD Format to check Compose Function Automatically.

Project is developed using Java Programming --> Coding
                            Eclipse IDE --> Platform
                            Selenium --> Test Automation
                            Cucumber --> BDD Formating
                
BDD(Behaviour Driven Development) functions in the following format--->

Feature File --> for Test Cases in BDD Format - Gherkin Language.
Step Definition File --> Java Fomrat stating all the functions executed for the communication between Feature File and Actual Code File(Selenium Locators & Functions).
Selenium File --> Java Format Locating all the Web Elements required and actions required as per the test scenarios.

---------------------------
To Execute this project
---------------------------
Open:
    ComposeGmail(Project main File) >> Features(Folder) >> Login.feature
      -->run scenarion
      
TestRun.java --> Runner File 
Steps.java --> Step Definitions File 
LoginPage.java --> Page Objects File  // Selenium Locator and Setter functions
 
-->All the test cases are visible in "TestCases_GmailCompose.xlsx" File
