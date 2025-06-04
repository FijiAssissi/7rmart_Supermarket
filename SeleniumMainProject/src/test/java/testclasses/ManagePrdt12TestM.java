package testclasses;

import org.testng.annotations.Test;

import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageProduct12PageM;

public class ManagePrdt12TestM extends BaseM
{
	LoginPageM login;
	HomepageM home;
	ManageProduct12PageM managePrdt12;
  @Test
  public void manageprdt12() 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
		login= loginPageM.addUserNamePassWord("admin","admin");
		 home=login.clickSignIn(); 
		 home.managePrdt12MoreInoClick();
		 ManageProduct12PageM managePrdt12obj=new ManageProduct12PageM(driver);
		 managePrdt12obj.managePrdt12NewIconClick().addTitle().selectPrdtType();
  }
}
