package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPage extends Base{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div[2]/div/div/div[1]/div/div[1]/strong")
	private WebElement welcomeMsg;
	
	@FindBy(xpath="//div[contains(text(),'Incorrect username and/or password. Please try aga')]")
	private WebElement errorMsg;
	
	public void enterEmail(String emailAdd) {
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	public boolean welcomeText() {
		if(welcomeMsg.isDisplayed())
			return true;
		else
			return false;	
	}
	
	public boolean errorPopup() {
		if(errorMsg.isDisplayed())
			return true;
		else return false;
	}
	
	
	
	
	
	
	
	
}