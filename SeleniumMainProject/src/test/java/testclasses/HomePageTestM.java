package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.LoginPageM;
import pageclasses.HomepageM;

public class HomePageTestM extends BaseM
{
	
	LoginPageM login;
	HomepageM home;
  @Test
  public void ClickOnAdmin() 
  {
	  /*
	  	LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 loginPageM.clickSignIn();   
	  HomepageM logout=new HomepageM(driver);
	  logout.ClickOnAdminIcon();
	  */
	  //System.out.println(driver.getTitle());
	  LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 home=loginPageM.clickSignIn();
		 home.ClickOnAdminIcon();
		 login=home.clickOnLogout();
	  String expected= "Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  boolean isManageNewsDisplayed=home.ismanageNewsDisplayed();
	  Assert.assertEquals(actual, expected,Constants.ERRORMESSAGEFORLOGOUT);
	  Assert.assertTrue(isManageNewsDisplayed,Constants.ERRORMESSAGEFORMANAGEMOREINFO);
  }
}
