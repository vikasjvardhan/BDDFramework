Feature: Login page automation of saucedemo application

Scenario: Check login is successful with valid credentials entered

Given User is on the login page
When  User enters valid username and password
And Clicks on Login Button
Then User is navigated to the Home Page
And    Close the browser

