package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitUtilities;

public class SearchAdminUsers 
{
	public WebDriver driver;
	WaitUtilities waitutility=new WaitUtilities();
	public SearchAdminUsers(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 @FindBy (xpath="//a[@onclick='click_button(2)']") WebElement searchIcon;
 @FindBy(xpath="//input[@id='un']")WebElement userNameSearch;
 @FindBy(xpath="//select[@id='ut']")WebElement UserTypeSearch;
 @FindBy(xpath="//button[@name='Search']")WebElement searchBtn;
 
 @FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[1]")WebElement searchResultUserName;
 /*
 @FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[2]")WebElement searchResultUserType;
 */
 public SearchAdminUsers clickOnsearch()
 {
	 waitutility.waitForElementToClick(driver, searchIcon);//using waitutilityobject calling methods in that class
	 searchIcon.click();
	 return this;
 }
 public SearchAdminUsers addSearchDetails()
 {
	waitutility.waitForElementToSelect(driver, userNameSearch);
	userNameSearch.sendKeys("FF1234"); 
	Select select= new Select(UserTypeSearch);
	select.selectByVisibleText("Staff");
	return this;
 }
 public SearchAdminUsers searchSubmit()
 {
	 searchBtn.click();
	 return this;
 }
 public boolean searchResultDisplayed()
 {
	 	return searchResultUserName.isDisplayed();	
 }
 
}
