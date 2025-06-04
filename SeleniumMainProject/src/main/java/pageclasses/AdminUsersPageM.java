package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtilities;
import utilities.WaitUtilities;
//admin users page
	public class AdminUsersPageM
	{
		public WebDriver driver;
		WaitUtilities waitutility=new WaitUtilities();
		PageUtilities pageUtility=new PageUtilities();
		
	public AdminUsersPageM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newAdminIcon;
	@FindBy(xpath = "//input[@id='username']")WebElement usernameTextField;
	@FindBy(xpath="//input[@id='password']")WebElement passWordTextField;
	@FindBy(xpath = "//select[@id='user_type']")WebElement UserTypeDropDown;
	@FindBy(xpath = "//button[@type='submit' and @name='Create']")WebElement saveBtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertSuccess;
//	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertFail;
	
	
	public AdminUsersPageM NewAdminUserclick()//it is not going to any other pages, same page
	{
		newAdminIcon.click();
		return this;
	}
	public AdminUsersPageM addAdminUserInfor()
	{
		usernameTextField.sendKeys("FFABC11234");
		passWordTextField.sendKeys("112233");
		return this;
	}
	public AdminUsersPageM UserTypeDropDown()
	{
		//UserTypeDropDown.click();	
		//Select select=new Select(UserTypeDropDown);
		//select.selectByVisibleText("Staff");
		pageUtility.selectByVisibleText(UserTypeDropDown, "Staff");
		return this;
	}
	public AdminUsersPageM clickOnSave()
	{
		waitutility.waitForElementToClick(driver, saveBtn);
		saveBtn.click();
		return this;
		
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
