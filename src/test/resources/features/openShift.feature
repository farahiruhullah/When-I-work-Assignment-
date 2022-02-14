Feature: openshift

Background:

Given user is on the login page
When user enters user email 'ruhullah.farahi@gmail.com' and password 'Wheniwork@test'
And user clicks login button
And user should land on the schedule page
And user clicks on schedule tab
And user clicks on an openshift
And user clicks on require pick up approval
And user clicks on save button
And user should see publish&notify button


@openshift
Scenario: user creates an open shift

And user clicks on the shift
And user clicks on delete tab
Then user clicks on confirm delete


@assign
Scenario: user assings shift to employee

And user clicks on edit on the shift
And user assigns the shift to an employee
And user clicks on save and publish the shift
And user verifies shift is correctly published and assigned to the employee
Then user delets the shift






