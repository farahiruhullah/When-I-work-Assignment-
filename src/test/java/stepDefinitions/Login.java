package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddEmployeeObjects;
import pageObjects.LoginPage;
import utilities.UtilityClass;

public class Login extends Base{
	
	LoginPage loginPage= new LoginPage();
	
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		String actualPageTitle= driver.getTitle();
		String expectedTitle= "Log In | When I Work";
		Assert.assertEquals(expectedTitle,actualPageTitle);
		logger.info("user is on the login page");
		
		
			    
	    
	}
	@When("user enters user email {string} and password {string}")
	public void user_enters_user_email_and_password(String email, String password) {
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		logger.info("user enters email and password");
		UtilityClass.takeScreenShot();
	    
	
	}
	@When("user clicks login button")
	public void user_clicks_login_button() {
		loginPage.clickSubmit();
		logger.info("user clicks on the login button");
		UtilityClass.takeScreenShot();
	   
	    
	}
	@Then("user should land on the schedule page")
	public void user_should_land_on_the_schedule_page() {
		Assert.assertTrue(loginPage.welcomeText());
		logger.info("user sees the welcome text");
		UtilityClass.takeScreenShot();
	   
	}
	
	@Then("user should see the error popup msg for incorrect username and password")
	public void user_should_see_the_error_popup_msg_for_incorrect_username_and_password() {
	    Assert.assertTrue(loginPage.errorPopup());
	    logger.info("user sees the popup msg for incorrect email password");
	    UtilityClass.takeScreenShot();
	}
	
	

	

}
