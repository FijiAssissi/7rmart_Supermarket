package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchAdminUsers 
{
	public WebDriver driver;
	
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
 public void clickOnsearch()
 {
	 searchIcon.click();
 }
 public void addSearchDetails()
 {
	userNameSearch.sendKeys("FF1234"); 
	Select select= new Select(UserTypeSearch);
	select.selectByVisibleText("Staff");
 }
 public void searchSubmit()
 {
	 searchBtn.click();
 }
 public String searchresult()
 {
	 String expected=searchResultUserName.getText();
	 return expected;		
 }
 
}
