package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProduct12PageM 
{
	public WebDriver driver;
	//constructor
	public ManageProduct12PageM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//webElements
	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product' and @class='small-box-footer']")WebElement managePrdt12MoreInfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement managePrdt12NewIcon;
	@FindBy(xpath = "//input[@id='title']")WebElement addTitleField;
	@FindBy(xpath="//label[@class='radio-inline'][3]")WebElement othersRadioPrdtType;
	@FindBy(xpath="//select[@id='cat_id']")WebElement category;
	@FindBy(xpath="//select[@id='sub_id']")WebElement subcategory;
	@FindBy(xpath="//select[@id='grp_id']")WebElement groupField;
	@FindBy(xpath="//label[@class='radio-inline' and @onclick='myFunction_piece()']")WebElement priceTypeRadio;
	@FindBy(xpath="//input[@id='m_weight']")WebElement weightValue;
	@FindBy(xpath="//select[@id='w_unit']")WebElement weightUnit;
	@FindBy(xpath="//select[@id='w_unit']")WebElement maximumQuantity;
	@FindBy(xpath="//input[@id='w_price']")WebElement price;
	@FindBy(xpath="//input[@id='w_stock']")WebElement stockAvailability;
	@FindBy(xpath="//button[@type='submit']")WebElement saveBtn;
	
	//actions
	/*
	public void managePrdt12MoreInoClick()
	{
		managePrdt12MoreInfo.click();
	}
	*/
	
	public ManageProduct12PageM managePrdt12NewIconClick()
	{
		managePrdt12NewIcon.click();
		return this;
	}
	public ManageProduct12PageM addTitle()
	{
		addTitleField.sendKeys("Books");
		return this;
	}
	public ManageProduct12PageM selectPrdtType()
	{
		othersRadioPrdtType.click();
		return this;
	}
}
