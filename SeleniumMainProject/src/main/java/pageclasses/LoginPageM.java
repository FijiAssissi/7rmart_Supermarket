package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class LoginPageM 
{
	public WebDriver driver;
	
	public LoginPageM (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@name='username']")WebElement userName;
	@FindBy(xpath ="//input[@name='password']")WebElement passWord;
	@FindBy(xpath = "//button[text()='Sign In']")WebElement signInBtn;
	@FindBy(xpath="//li[text()='Dashboard']")WebElement dashBoard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement loginAlert;
	
	public void addUserNamePassWord(String username, String passwrd)
	{
		userName.sendKeys(username);
		passWord.sendKeys(passwrd);
	}
	public void clickSignIn()
	{
		signInBtn.click();
	}
	public boolean isDashboardDisplayed()
	{
		return dashBoard.isDisplayed();
	}
	public boolean isAlertDisplayed()
	{
		return loginAlert.isDisplayed();
	}
}
