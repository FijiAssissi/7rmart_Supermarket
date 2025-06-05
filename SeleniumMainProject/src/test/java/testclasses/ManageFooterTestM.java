package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageCategoryPageM;
import pageclasses.ManageFooterTextpageM;
import utilities.ExcelUtitlities;

public class ManageFooterTestM extends BaseM
{
	LoginPageM login;
	HomepageM home;
	ManageFooterTextpageM manageFooter;
  @Test
  public void manageFooter() throws IOException 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
	  String userName=ExcelUtitlities.readStringData(1, 0, "LoginPageTest");//passing values using excel 
		String password=ExcelUtitlities.readStringData(1, 1,"LoginPageTest" );
		loginPageM.addUserNamePassWord(userName, password);
		 home=loginPageM.clickSignIn(); 
		 home.manageFooterMoreInfoClick();
		 ManageFooterTextpageM manageFooterobj=new ManageFooterTextpageM(driver);
		 manageFooterobj.clickOnActionBtn().addAddress().addEmail().addphone().clickOnUpdateBtn();
		 boolean isSuccessAlertDisplayed= manageFooterobj.isAlertDisplayed();
		 Assert.assertTrue(isSuccessAlertDisplayed, Constants.ERRORMESSAGE);
  }
}
