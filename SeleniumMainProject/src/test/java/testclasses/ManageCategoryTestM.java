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
	
	HomepageM home;
	ManageCategoryPageM manageCategory;
	//AdminUsersPageM adminUsers;
	//ManageNewsPageM manageNews;
  @Test
  public void manageCategory() throws  IOException, AWTException 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
	  String userName=ExcelUtitlities.readStringData(1, 0, "LoginPageTest");//passing values using excel 
		String password=ExcelUtitlities.readStringData(1, 1,"LoginPageTest" );
		loginPageM.addUserNamePassWord(userName, password);
		home=loginPageM.clickSignIn();
		//ManageCategoryPageM manageCategoryobj=new ManageCategoryPageM(driver);
	manageCategory=	home.manageCategoryMoreInforClickNew();
		manageCategory.categoryNewIconClick().addCategoryNmae().clickOnDiscount().addCategoryImage().clickOnSaveBtn();
		boolean successAlert=manageCategory.isSuccessAlertDisplayed();
		Assert.assertTrue(successAlert, Constants.ERRORMESSAGE);
  }
}
