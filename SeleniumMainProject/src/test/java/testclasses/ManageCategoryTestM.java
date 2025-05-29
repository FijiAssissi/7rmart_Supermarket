package testclasses;

import org.testng.annotations.Test;

import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageCategoryPageM;
import pageclasses.ManageNewsPageM;

public class ManageCategoryTestM extends BaseM 
{
	LoginPageM login;
	HomepageM home;
	ManageNewsPageM manageCategory;
	//AdminUsersPageM adminUsers;
	//ManageNewsPageM manageNews;
  @Test
  public void manageCategory() 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 home=loginPageM.clickSignIn();
		
		ManageCategoryPageM manageCategoryobj=new ManageCategoryPageM(driver);
		home.manageCategoryMoreInforClick();
		manageCategoryobj.categoryNewIconClick().addCategoryNmae().clickChooseFile();
	
  }
}
