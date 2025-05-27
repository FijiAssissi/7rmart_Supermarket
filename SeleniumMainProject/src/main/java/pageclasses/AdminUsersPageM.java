package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitUtilities;

	public class AdminUsersPageM
	{
		public WebDriver driver;
		WaitUtilities waitutility=new WaitUtilities();
		
	public AdminUsersPageM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminMoreInfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newAdminIcon;
	@FindBy(xpath = "//input[@id='username']")WebElement usernameTextField;
	@FindBy(xpath="//input[@id='password']")WebElement passWordTextField;
	@FindBy(xpath = "//select[@id='user_type']")WebElement UserTypeDropDown;
	@FindBy(xpath = "//button[@type='submit' and @name='Create']")WebElement saveBtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertSuccess;
//	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertFail;
	
	public void adminUsersMoreInfoClick()
	{
		waitutility.waitForElementToClick(driver, adminMoreInfo);
		adminMoreInfo.click();
	}
	public void NewAdminUserclick()
	{
		newAdminIcon.click();
	}
	public void addAdminUserInfor()
	{
		usernameTextField.sendKeys("FFABC11234");
		passWordTextField.sendKeys("112233");
	}
	public void UserTypeDropDown()
	{
		//UserTypeDropDown.click();	
		Select select=new Select(UserTypeDropDown);
		select.selectByVisibleText("Staff");
	}
	public void clickOnSave()
	{
		waitutility.waitForElementToClick(driver, saveBtn);
		saveBtn.click();
		
	}
	public boolean isAlertSuccessDisplayed()
	{
	return alertSuccess.isDisplayed();	
	}
	/*
	public boolean isAlertFailDisplayed()
	{
	return alertFail.isDisplayed();	
	}
	*/
	}
