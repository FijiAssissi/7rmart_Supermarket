package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageContactPageM;
import pageclasses.ManageNewsPageM;
import pageclasses.SearchListCategoriesPageM;

public class SearchListCategoryTestM extends BaseM
{
	LoginPageM login;
	HomepageM home;
	SearchListCategoriesPageM searchCategory;
  @Test
  public void searchListCategory() 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
		 loginPageM.addUserNamePassWord("admin","admin");
		 home=loginPageM.clickSignIn(); 
		 home.manageCategoryMoreInforClick();
		 SearchListCategoriesPageM searchListCategory=new SearchListCategoriesPageM(driver);
		 searchCategory=searchListCategory.clickOnSearchIcon().addCategoryName().ClickOnSearchBtn();//storing the result in to searchcategory
		 boolean failSearch=searchCategory.isfailAlertDisplayed();//if the result is fail,ie the error message alert is displayed
		 
		 Assert.assertTrue(failSearch, Constants.ERRORMESSAGEFORSEARCHCATEGORY);
		 
  }
}
