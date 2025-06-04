package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageCategoryPageM;
import pageclasses.ManageFooterTextpageM;

public class ManageFooterTestM extends BaseM
{
	LoginPageM login;
	HomepageM home;
	ManageFooterTextpageM manageFooter;
  @Test
  public void manageFooter() 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
		login= loginPageM.addUserNamePassWord("admin","admin");
		 home=login.clickSignIn(); 
		 home.manageFooterMoreInfoClick();
		 ManageFooterTextpageM manageFooterobj=new ManageFooterTextpageM(driver);
		 manageFooterobj.clickOnActionBtn().addAddress().addEmail().addphone().clickOnUpdateBtn();
		 boolean isSuccessAlertDisplayed= manageFooterobj.isAlertDisplayed();
		 Assert.assertTrue(isSuccessAlertDisplayed, Constants.ERRORMESSAGE);
  }
}
