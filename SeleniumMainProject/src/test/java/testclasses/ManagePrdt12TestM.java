package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.HomepageM;
import pageclasses.LoginPageM;
import pageclasses.ManageProduct12PageM;
import utilities.ExcelUtitlities;

public class ManagePrdt12TestM extends BaseM
{
	LoginPageM login;
	HomepageM home;
	ManageProduct12PageM managePrdt12;
  @Test
  public void manageprdt12() throws IOException 
  {
	  LoginPageM loginPageM=new LoginPageM(driver);
	  String userName=ExcelUtitlities.readStringData(1, 0, "LoginPageTest");//passing values using excel 
		String password=ExcelUtitlities.readStringData(1, 1,"LoginPageTest" );
		loginPageM.addUserNamePassWord(userName, password);
		 home=loginPageM.clickSignIn(); 
		 home.managePrdt12MoreInoClick();
		 ManageProduct12PageM managePrdt12obj=new ManageProduct12PageM(driver);
		 managePrdt12obj.managePrdt12NewIconClick().addTitle().selectPrdtType()
		 .selectCategory().selectSubCategory().addWeightValue()
		 .addWeightUnitdropDown().addMaxQuantity().addPrice().addStockAvailability().addImage().clickOnSaveBtn();
		boolean alertDisplay=managePrdt12obj.isAlertDisplayed();
		Assert.assertTrue(alertDisplay, Constants.ERRORMESSAGE);
  }
}
