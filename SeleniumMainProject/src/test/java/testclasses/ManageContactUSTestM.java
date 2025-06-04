package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;

import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageContactPageM;
import pageclasses.ManageNewsPageM;

public class ManageContactUSTestM extends BaseM 
{
	LoginPageM login;
	HomepageM home;
	ManageNewsPageM manageCategory;
	ManageContactPageM manageContactUs;
  @Test
  public void manageContactUs() 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 home=loginPageM.clickSignIn(); 
		 home.manageContactMoreInfo();
		 ManageContactPageM manageContactUs=new ManageContactPageM(driver);
		 manageContactUs.manageContactActionBtn().manageContactAddPhone().manageContactAddEmail().manageContactAddAddress().manageContactAddDeliveryTime().manageContactAddDeleiveryCharge().manageContactClickOnUpdate();
		 boolean SuccessAlertDisplay=manageContactUs.isSuccessAlertDisplayed();
	Assert.assertTrue(SuccessAlertDisplay, Constants.ERRORMESSAGE);
  }
}
