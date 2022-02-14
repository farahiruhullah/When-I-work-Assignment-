package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class AddEmployeeObjects extends Base {

	public AddEmployeeObjects() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(text(),'Scheduler')]")
	private WebElement scheduler;

	@FindBy(xpath = "//span[contains(text(),'Add Employees')]")
	private WebElement addEmployee;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='phone_number']")
	private WebElement phone;

	
	  @FindBy(xpath= "//div[@id='role-select-dropdown']//div[normalize-space()= 'Manager']//div[@class='Select__input-container css-ackcql']")
	  private WebElement dropDown; 
	  
	 

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[2]/button[1]/div[1]")
	private WebElement addInviteEmployee;

	@FindBy(xpath = "//div[contains(text(),'The employee has been saved.')]")
	private WebElement successMsg;

	public void clickScheduler() {
		scheduler.click();

	}

	public void clickAddEmployee() {
		addEmployee.click();
	}

	public void enterFname(String fName) {
		firstName.sendKeys(fName);
	}

	public void enterLname(String Lname) {
		lastName.sendKeys(Lname);
	}

	public void enterEmail(String Email) {
		email.sendKeys(Email);

	}

	public void enterPhone(String mobile) {
		phone.sendKeys(mobile);
	}

	public void selectDropDown() {
		dropDown.click();
	
	
		
		
	}

	public void clickAddEmployeeButton() {
		addInviteEmployee.click();

	}

	public boolean successAddMsg() {
		if (successMsg.isDisplayed())
			return true;
		else
			return false;

	}

}
