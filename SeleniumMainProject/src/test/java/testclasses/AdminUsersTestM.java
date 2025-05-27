package testclasses;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.AdminUsersPageM;
import pageclasses.LoginPageM;

public class AdminUsersTestM extends BaseM{
  @Test
  public void adminUsersTest() 
  {
	  	LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 loginPageM.clickSignIn();   
		 AdminUsersPageM adminUsersPageM=new AdminUsersPageM(driver);
		 adminUsersPageM.adminUsersMoreInfoClick();
		 adminUsersPageM.NewAdminUserclick();
		 adminUsersPageM.addAdminUserInfor();
		 adminUsersPageM.UserTypeDropDown();
		 adminUsersPageM.clickOnSave();
		 
	boolean alertsuccessisDisplayed=adminUsersPageM.isAlertSuccessDisplayed();
	Assert.assertTrue(alertsuccessisDisplayed, "Error");
	
  }
}
