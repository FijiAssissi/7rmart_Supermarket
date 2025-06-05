package testclasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageCategoryPageM;
import pageclasses.ManageNewsPageM;
import utilities.ExcelUtitlities;

public class ManageCategoryTestM extends BaseM 
{
	LoginPageM login;
	HomepageM home;
	ManageNewsPageM manageCategory;
	//AdminUsersPageM adminUsers;
	//ManageNewsPageM manageNews;
  @Test
  public void manageCategory() throws AWTException, IOException 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
	  String userName=ExcelUtitlities.readStringData(1, 0, "LoginPageTest");//passing values using excel 
		String password=ExcelUtitlities.readStringData(1, 1,"LoginPageTest" );
		loginPageM.addUserNamePassWord(userName, password);
		home=loginPageM.clickSignIn();
		ManageCategoryPageM manageCategoryobj=new ManageCategoryPageM(driver);
		home.manageCategoryMoreInforClick();
		manageCategoryobj.categoryNewIconClick().addCategoryNmae().clickOnDiscount().addCategoryImage().clickOnSaveBtn();
		boolean successAlert=manageCategoryobj.isSuccessAlertDisplayed();
		Assert.assertTrue(successAlert, Constants.ERRORMESSAGE);
  }
}
