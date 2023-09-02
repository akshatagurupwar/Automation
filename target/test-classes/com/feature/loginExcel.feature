Feature: validate Login Functionality for swag lab application

Scenario: check the login functionality for valid data
Given user is on the login page of swag lab
When user credentials takes  from excel username & password
And user click on login button
Then Login should be successful