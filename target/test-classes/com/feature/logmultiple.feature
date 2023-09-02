Feature: validate Login Functionality for swag lab application

Scenario: check the login functionality for valid data
Given user is on the login page of swag lab
When user credentials enter username & password
|standard_user|secret_sauce|
|problem_user|secret_sauce|
And user click on login button
Then Login should be successful