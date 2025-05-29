package testclasses;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.AdminUsersPageM;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;

public class AdminUsersTestM extends BaseM
{
	HomepageM home;
	AdminUsersPageM adminUsers;
	
  @Test
  public void adminUsersTest() 
  {
	  /*
	  	LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 loginPageM.clickSignIn();   
		 AdminUsersPageM adminUsersPageM=new AdminUsersPageM(driver);
		 adminUsersPageM.adminUsersMoreInfoClick();
		 adminUsersPageM.NewAdminUserclick();
		 adminUsersPageM.addAdminUserInfor();
		 adminUsersPageM.UserTypeDropDown();
		 adminUsersPageM.clickOnSave();
		*/
		LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 home=loginPageM.clickSignIn();   
		 adminUsers=home.adminUsersMoreInfoClick();
		 adminUsers.NewAdminUserclick().addAdminUserInfor().UserTypeDropDown().clickOnSave();
	boolean alertsuccessisDisplayed=adminUsers.isAlertSuccessDisplayed();
	Assert.assertTrue(alertsuccessisDisplayed, "Error");
	
  }
}
