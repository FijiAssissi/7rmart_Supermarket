package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.AdminUsersPageM;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageNewsPageM;
import utilities.ExcelUtitlities;

public class MangaeNewstestM extends BaseM
{
	LoginPageM login;
	HomepageM home;
	//AdminUsersPageM adminUsers;
	ManageNewsPageM manageNews;
  @Test
  public void EnterNewsInfo() throws IOException 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
	  String userName=ExcelUtitlities.readStringData(1, 0, "LoginPageTest");//passing values using excel 
		String password=ExcelUtitlities.readStringData(1, 1,"LoginPageTest" );
		loginPageM.addUserNamePassWord(userName, password);
		 home=loginPageM.clickSignIn();
		 home.manageNewsmoreInfoClick();
		 ManageNewsPageM managenewsobj=new ManageNewsPageM(driver);
		 manageNews=managenewsobj.mangeNewsNewIcon();
		 manageNews.enterNewsInfo().clickOnSaveBtn();
		 boolean manageNewsNewIconDisplayed= managenewsobj.mangenewsNewIconEnabled();
		 boolean successAlert=managenewsobj.newsCreatedAlert();
		 Assert.assertTrue(manageNewsNewIconDisplayed, Constants.ERRORMESSAGEFORMANAGEMOREINFO);
		 Assert.assertTrue(successAlert, Constants.ERRORMESSAGE);
	
		 
  }
}
