Feature: UI Automation Testing for Demoblaze store PAGE1
#test scripts using Cucumber Gherkins.

Background: To enter app url
When User Enter the URL of DemoBlaze WebSite "https://www.demoblaze.com"
    

@test1
  Scenario Outline: Automation for User Sign up
    Given User Launch the Browser
    And User Clicks on sign up
    And User Should enter user name "<userName>"
    And User Should enter password "<pass>"
    Then User Should Click on the sign up button
    And User need to click on ok button
    
Examples:
	|userName|pass|
	|poiuuiop|1234|
    
@test2 
    Scenario Outline: Automation for User Log in
 	When User Clicks on Log in
 	And User Should enter user name for log in "<userName_logg>"
    And User Should enter password for log in "<userPass_logg>"
    Then User Should Click on the Log in button
    Then User is Successfully logged in
 
Examples:
	|userName_logg|userPass_logg|
	|poiuuiop|1234|
	|poiuuiop|4321|   #negative case
    
@test3
    Scenario Outline: Automation of contact option
    When User Clicks on contact
    And User need to give contact email "<mail>"
    And User need to give contact name "<name>"
    And User need to give message "<message>"
    Then User Should Click on send message button
    And User need to click on ok button for successful sending
    
Examples:
	|mail|name|message|
	|group_1_project@gmail.com|testpass1|Group 1 Testing............|

@test4
   Scenario Outline: Automation for About us option
   When User Clicks on About us
   And User Clicks on screen to play or watch video about demo ui
   Then User Should Click on close button for finishing about us
     
@test5
   Scenario Outline: Automation for Title checking
   When User validating the Page Title
   And Return back of page title and current Uniform Resource Locater
   When User Clicks on Home
   And User validating the Page Title again