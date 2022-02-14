package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class OpenShiftObjects extends Base{
	
	public OpenShiftObjects(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[contains(text(),'Scheduler')]")
	private WebElement schedule;
	
	@FindBy(xpath="//body/div[@id='wheniwork-app']/div[@id='wheniwork-is-awesome']/div[@id='content']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]")
	private WebElement openspace;
	
	@FindBy(xpath="//label[contains(text(),'Require Pick Up Approval')]")
	private WebElement pickupApproval;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[2]/div[1]")
	private WebElement saveButton;
	
	@FindBy(xpath="//div[contains(text(),'Publish & Notify')]")
	private WebElement publishNotify;
	
	@FindBy(xpath="//i[@class='fa fa-ellipsis-v']")
	private WebElement timeDelete;
	
	@FindBy(xpath="//li[contains(text(),'Delete')]")
	private WebElement deleteTab;
	
	@FindBy(xpath="//div[contains(text(),'Confirm Delete')]")
	private WebElement confirmDelete;
	
	
	public void clickSchedule() {
		schedule.click();
	}
	
	public void clickOpenspace() {
		openspace.click();
	}
	
	public void clickPickup() {
		pickupApproval.click();
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public boolean publishNotify() {
		if(publishNotify.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickTime() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", timeDelete);
		
		//Actions action= new Actions(driver);
		//action.moveToElement(timeDelete).click().build().perform();
		
		
	}
	
	public void clickDeleteTab() {
		deleteTab.click();
		
	}
	
	public void clickConfirmDelete() {
		confirmDelete.click();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	


