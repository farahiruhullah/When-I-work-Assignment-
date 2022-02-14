package stepDefinitions;

import org.junit.Assert;


import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OpenShiftObjects;
import utilities.UtilityClass;

public class OpenShift extends Base{
	
	OpenShiftObjects openShift= new OpenShiftObjects();
	
	@When("user clicks on schedule tab")
	public void user_clicks_on_schedule_tab() {
		openShift.clickSchedule();
		logger.info("user clicks on the scheduler tab");
		UtilityClass.takeScreenShot();
	    
	}
	@When("user clicks on an openshift")
	public void user_clicks_on_an_openshift() {
		openShift.clickOpenspace();
		logger.info("user clicks on the plus sign to add open shift");
		UtilityClass.takeScreenShot();
	    
	}
	@When("user clicks on require pick up approval")
	public void user_clicks_on_require_pick_up_approval() {
		openShift.clickPickup();
		logger.info("user selects the pick up approval" );
		UtilityClass.takeScreenShot();
	   
	}
	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		openShift.clickSaveButton();
		logger.info("user clicks on save button");
		UtilityClass.takeScreenShot();
	  
	}
	@When("user should see publish&notify button")
	public void user_should_see_publish_notify_button() {
		Assert.assertTrue(openShift.publishNotify());
		logger.info("user sees the publish notify button in green");
		UtilityClass.takeScreenShot();
	
	
	   
	}
	@When("user clicks on the shift")
	public void user_clicks_on_the_shift()  {
		openShift.clickTime();
		logger.info("user clicks on the time shift tab");
		UtilityClass.takeScreenShot();
		
	    
	}
	@When("user clicks on delete tab")
	public void user_clicks_on_delete_tab() {
		openShift.clickDeleteTab();
		logger.info("user clicks on delete tab");
		UtilityClass.takeScreenShot();
	   
	}
	@Then("user clicks on confirm delete")
	public void user_clicks_on_confirm_delete() {
		openShift.clickConfirmDelete();
		logger.info("user clicks on confirm delete tab");
		UtilityClass.takeScreenShot();
	    
	}

	
	

}
