package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.AdminUsersPageM;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageNewsPageM;

public class MangaeNewstestM extends BaseM
{
	LoginPageM login;
	HomepageM home;
	//AdminUsersPageM adminUsers;
	ManageNewsPageM manageNews;
  @Test
  public void EnterNewsInfo() 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
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
