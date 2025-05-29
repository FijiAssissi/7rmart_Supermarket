package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtilities;

public class ManageCategoryPageM 
{
	public WebDriver driver;
	WaitUtilities wait= new WaitUtilities();
	public ManageCategoryPageM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//webelements
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")WebElement manageCategoryMoreInfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement manageCategoryNewIcon;
	@FindBy(xpath = "//input[@id='category']")WebElement CategoryName;
	//@FindBy(xpath = "//input[@id='main_img']") WebElement manageCategoryChooseFileIcon;
	@FindBy(xpath = "//input[@type='file']") WebElement manageCategoryChooseFileIcon;
	@FindBy(xpath="//button[text()='Save']") WebElement manageCategorySaveBtn;
	
	/*
	public void manageCategoryMoreInforClick()
	{
		manageCategoryMoreInfo.click();
	}
	
*/
	public ManageCategoryPageM categoryNewIconClick()
	{
		manageCategoryNewIcon.click();
		return this;
	}
	public ManageCategoryPageM addCategoryNmae()
	{
		CategoryName.sendKeys("Books");
		return this;
	}
	public ManageCategoryPageM clickChooseFile()
	{
		wait.waitForElementToClick(driver, manageCategoryChooseFileIcon);
		manageCategoryChooseFileIcon.click();
		return this;
	}
	public ManageCategoryPageM addCategoryImage()
	{
		wait.waitForElementToSelect(driver,manageCategoryChooseFileIcon);
		manageCategoryChooseFileIcon.sendKeys("C:\\Users\\jerri\\Downloads\\books.jpg");
		return this;
	}
	public ManageCategoryPageM clickOnSaveBtn()
	{
		manageCategorySaveBtn.click();
		return this;
	}
}
