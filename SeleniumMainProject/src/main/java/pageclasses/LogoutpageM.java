package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutpageM 
{
	public WebDriver driver;
	public LogoutpageM(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//a[@class='nav-link' and @data-toggle='dropdown']") WebElement admin;
@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'][1]") WebElement logout;

	public void ClickOnAdminIcon()
	{
	admin.click();
	logout.click();
	}
}
