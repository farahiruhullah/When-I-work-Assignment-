package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ShiftAssignObjects;
import utilities.UtilityClass;

public class AssignShift extends Base{
	
	ShiftAssignObjects shiftAssign= new ShiftAssignObjects();
	
	@When("user clicks on edit on the shift")
	public void user_clicks_on_edit_on_the_shift() {
		shiftAssign.ClickEdit();
		logger.info("user clicks on the edit button");
		UtilityClass.takeScreenShot();
	   
	}
	@When("user assigns the shift to an employee")
	public void user_assigns_the_shift_to_an_employee() {
		shiftAssign.selectEmployee();
		logger.info("user assings the shift to an employee");
		UtilityClass.takeScreenShot();
	  
	}
	@When("user clicks on save and publish the shift")
	public void user_clicks_on_save_and_publish_the_shift() {
		shiftAssign.clickSavePublish();
		logger.info("user clicks on the save and publish button");
		UtilityClass.takeScreenShot();
	  
	}
	@When("user verifies shift is correctly published and assigned to the employee")
	public void user_verifies_shift_is_correctly_published_and_assigned_to_the_employee() {
		Assert.assertEquals(shiftAssign.getEmployeeName(), "Ruhullah Farahi");
		logger.info("user selects employee");
		UtilityClass.takeScreenShot();
	   
	}
	@Then("user delets the shift")
	public void user_delets_the_shift() {
		shiftAssign.clickDeleteTab();
		logger.info("user deletes the shift");
		UtilityClass.takeScreenShot();
	  
	}

	
	
	
	
	
	

}
