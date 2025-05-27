package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.LoginPageM;
import pageclasses.LogoutpageM;

public class LogoutTestM extends BaseM{
  @Test
  public void ClickOnAdmin() 
  {
	  	LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 loginPageM.clickSignIn();   
	  LogoutpageM logout=new LogoutpageM(driver);
	  logout.ClickOnAdminIcon();
	  //System.out.println(driver.getTitle());
	  String expected= "Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual, expected,"Actual and expected are not same");
  }
}
