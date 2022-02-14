Feature: login

Background: 
Given user is on the login page

Scenario: user logs into the account


When user enters user email 'ruhullah.farahi@gmail.com' and password 'Wheniwork@test'
And user clicks login button
Then user should land on the schedule page


@unsucessfulLogin
Scenario:

When user enters user email 'ruhullah.farahi@gmail.com' and password 'Wheniworktest'
And user clicks login button
Then user should see the error popup msg for incorrect username and password



