package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class ShiftAssignObjects extends Base{
	
	public ShiftAssignObjects(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@class='btn btn-primary edit-shift btn-block btn-sm']//div")
	private WebElement editTab;
	
	@FindBy(xpath="//fieldset[@class='form-group col user-shift-dropdown-container']//div[@class='Select__indicator Select__dropdown-indicator css-tlfecz-indicatorContainer']")
	private WebElement dropList;
	
	
	@FindBy(xpath="//div[normalize-space()='Save & Publish']")
	private WebElement savePublish;
	
	@FindBy(xpath="//div[normalize-space()='Ruhullah Farahi']")
	private WebElement employeeName;
	
	@FindBy(xpath="//fieldset[@class='form-group col user-shift-dropdown-container']//div[@class='Select__indicator Select__dropdown-indicator css-tlfecz-indicatorContainer']")
	private WebElement dropNameConfirm;
	
	@FindBy(xpath="//i[@class='fa fa-ellipsis-v']")
	private WebElement shiftItem;
	
	@FindBy(xpath="//li[@class='list-group-item delete-shift']")
	private WebElement deleteTab;
	
	
	public void ClickEdit() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", editTab);
	}
	
	public void selectEmployee() {
		Select drpdown= new Select(dropList);
		drpdown.selectByVisibleText("Ruhullah Farahi");	
		
	}
	
	public void clickSavePublish() {
		savePublish.click();
		
	}
	
	public boolean getEmployeeName() {
		
		if(employeeName.getText() == "Ruhullah Farahi")
			return true;
		else
			return false;
		
	}
	
	public void clickShiftItem() {
		shiftItem.click();
	}
	
	public void clickDeleteTab() {
		deleteTab.click();
	}
	
	
	
	
	
	
	
	

}
