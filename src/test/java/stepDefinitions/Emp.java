package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import pageObjects.AddEmployeeObjects;
import utilities.UtilityClass;

public class Emp extends Base{
	
	AddEmployeeObjects employee= new AddEmployeeObjects();
	
	
	@Then("user clicks on Add Employee tab")
	public void user_clicks_on_add_employee_tab() {
	   employee.clickAddEmployee();
	   logger.info("user clicks on add employee");
	   UtilityClass.takeScreenShot();
	   
	}
	@Then("user enters firstname {string} and lastname {string} and email {string} and mobile {string}")
	public void user_enters_firstname_and_lastname_and_email_and_mobile(String firstname, String lastname, String email, String mobile) {
		employee.enterFname(firstname);
		employee.enterLname(lastname);
		employee.enterEmail(email);
		employee.enterPhone(mobile);
		logger.info("user fills up the form");
		UtilityClass.takeScreenShot();
	   
	}
	@Then("user selects from dropdown")
	public void user_selects() {
		employee.selectDropDown();
		logger.info("user selects the employe");
		UtilityClass.takeScreenShot(); 
		
	    
	}
	@Then("user clicks add and invite button")
	public void user_clicks_add_and_invite_button() {
		employee.clickAddEmployeeButton();
		logger.info("user clicks on add invite button");
		UtilityClass.takeScreenShot();
	    
	}
	@Then("user should see the success msg empolyee has been added")
	public void user_should_see_the_success_msg_empolyee_has_been_added() {
		employee.successAddMsg();
		logger.info("user sees the success msg that employee is added");
		UtilityClass.takeScreenShot();
	   
	}



	

}
