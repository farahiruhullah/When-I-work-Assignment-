Feature: add employee

Background: 
Given user is on the login page
When user enters user email 'ruhullah.farahi@gmail.com' and password 'Wheniwork@test'
And user clicks login button
Then user should land on the schedule page


@addEmployee
Scenario: user adds employee

And user clicks on schedule tab
And user clicks on Add Employee tab
And user enters firstname 'Mike' and lastname 'Smith' and email 'mike.smith@gmail.com' and mobile '2368892526' 
And user selects from dropdown
And user clicks add and invite button
Then user should see the success msg empolyee has been added

