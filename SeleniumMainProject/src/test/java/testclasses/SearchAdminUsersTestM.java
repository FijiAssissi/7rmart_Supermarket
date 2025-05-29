package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.AdminUsersPageM;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.SearchAdminUsers;

public class SearchAdminUsersTestM extends BaseM
{
	//globally declaring so we can use this in multiple methods 
	LoginPageM login;
	HomepageM home;
	AdminUsersPageM adminUsers;
	SearchAdminUsers searchadminUsers;
  @Test
  public void searchAdminUSers() 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);//create object
		 loginPageM.addUserNamePassWord("admin","admin");
		home= loginPageM.clickSignIn(); //return HomepageM
		 AdminUsersPageM adminUsersPageM=new AdminUsersPageM(driver);
		adminUsers= home.adminUsersMoreInfoClick();//returns the Adminuserspage
		 SearchAdminUsers searchAdmin=new SearchAdminUsers(driver);
		 /*
		 searchAdmin.clickOnsearch();
		 searchAdmin.addSearchDetails();
		 searchAdmin.searchSubmit();
		 */
		 searchadminUsers.clickOnsearch().addSearchDetails().searchSubmit();//method chaining 
		 boolean searchresultPresent=searchAdmin.searchResultDisplayed();
		 Assert.assertTrue(searchresultPresent,Constants.ERRORMESSAGE);
  }
}
