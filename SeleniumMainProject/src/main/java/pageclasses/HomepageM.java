package pageclasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//here logout actions and clicking the admin users more info
public class HomepageM 
{
	public WebDriver driver;//globally declaring webdriver
	public HomepageM(WebDriver driver)//constructor
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//a[@class='nav-link' and @data-toggle='dropdown']") WebElement admin;
@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'][1]") WebElement logout;
@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminMoreInfo;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='active nav-link']") WebElement manageNewsMoreInfo;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")WebElement manageCategoryMoreInfo;

	public HomepageM ClickOnAdminIcon()//when selecting admin , click on admin and click logout
	//so here actions happen in the Homepage itself and it is not going to any other pages
	{
	admin.click();
	//logout.click();
	return this;
	}
	public LoginPageM clickOnLogout()//here after clicking the Logout , it is going to Login page
	{
		logout.click();
		return new LoginPageM(driver);
	}
	public AdminUsersPageM adminUsersMoreInfoClick()//here after clicking the admin users moreinfo, it is going to admin page
	{
		//waitutility.waitForElementToClick(driver, adminMoreInfo);
		adminMoreInfo.click();
		return new AdminUsersPageM(driver);
	}
	public ManageNewsPageM manageNewsmoreInfoClick()
	{
		manageNewsMoreInfo.click();
		return new ManageNewsPageM(driver);
	}
	public boolean ismanageNewsDisplayed()
	{
		return manageNewsMoreInfo.isDisplayed();
	}
	public ManageCategoryPageM manageCategoryMoreInforClick()
	{
		manageCategoryMoreInfo.click();
		return new ManageCategoryPageM(driver);
	}
}
