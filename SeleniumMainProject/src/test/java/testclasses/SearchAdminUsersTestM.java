package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.AdminUsersPageM;
import pageclasses.LoginPageM;
import pageclasses.SearchAdminUsers;

public class SearchAdminUsersTestM extends BaseM{
  @Test
  public void searchAdminUSers() 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 loginPageM.clickSignIn(); 
		 AdminUsersPageM adminUsersPageM=new AdminUsersPageM(driver);
		 adminUsersPageM.adminUsersMoreInfoClick();
		 SearchAdminUsers searchAdmin=new SearchAdminUsers(driver);
		 searchAdmin.clickOnsearch();
		 searchAdmin.addSearchDetails();
		 searchAdmin.searchSubmit();
		 String userNameSearchActual="FF1234";
		 String expected=searchAdmin.searchresult();
		 Assert.assertEquals(userNameSearchActual,expected,"Error");
  }
}
