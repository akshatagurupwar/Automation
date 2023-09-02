@login
Feature: validate Login Functionality for swag lab application
Background:
Given user is on the login page of swag lab

@log1
Scenario: check the login functionality for valid data
When user enter the username and password
And user click on login button
Then Login should be successful

@log2
Scenario: check the login functionality for valid data
When user enter the invalid username and password
And user click on login button
Then error msg shoulb be displayed
