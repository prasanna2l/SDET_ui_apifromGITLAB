Feature: UI Automation Testing for Demoblaze store PAGE2
#test scripts using Cucumber Gherkins.

Background: To enter app url
When User Enter the URL of DemoBlaze WebSite "https://www.demoblaze.com"

@test6
   Scenario Outline: Automation for product inspecting
    When User clicks on phones for inspect
    And User Clicks on desired phone Samsung galaxy
    And User Navigates back for inspecting other phones
    And User Clicks on desired phone Nokia lumia
    And User Navigates back To Home page
    
@test7
   Scenario Outline: Automation for phone product Add to Cart
    When User clicks on phones
    And User Clicks on Nexus
    And User Clicks on Nexus to Add to Cart
    Then User need to click on ok button for adding phone
    And User Navigates back To Home page from current page
    
    
@test8
   Scenario Outline: Automation for Laptop product Adding to Cart
    When User clicks on Laptops
    And User Clicks on MacBook Pro
    And User Clicks on MacBook Pro to Add to Cart
    Then User need to click on ok button for adding laptop
    And User Navigates back To Home page from laptop page

@test9
   Scenario Outline: Automation for Moniter product Adding to Cart 
    When User clicks on Moniter
    And User Clicks on Apple monitor
    And User Clicks on Apple monitor to Add to Cart
    Then User need to click on ok button for adding moniter
    And User Navigates back To Home page from moniter page
    
@test10
   Scenario Outline: Automation for Placing Order
    When User clicks on Cart button
    And User need to Click on Place Order button
    And User Should enter Name "<Name>"
    And User Should enter Country "<Country>"
    And User Should enter City "<City>"
    And User Should enter Credit card "<Creditcard>"
    And User Should enter Month "<Month>"
    And User Should enter Year "<Year>"
    And User need to Click on Purchase button
    Then User successfully purchased and need to click on ok button 
    
Examples: 
	|Name|Country|City|Creditcard|Month|Year|
	|Group1 Project|India|Erode|1234 4321 000X|12|2000|

@test11
    Scenario Outline: Automation for Log out
    When User Clicks on Log inn
    Then User Should enter user name for log inn "<userName_loggg>"
    Then User Should enter password for log inn "<pass_loggg>"
    When User clicks on Log inn buttonn
    When User clicks on Log out button
    Then User is successfully logged out   
    
Examples: 
	|userName_loggg|pass_loggg|
	|poiuuiop|1234|
    