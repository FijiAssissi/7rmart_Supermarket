package testclasses;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.Constants;
import pageclasses.LoginPageM;

public class LogintestM extends BaseM{
  @Test
  public void verifyLoginUserpasswdtest1() 
  {
	 LoginPageM loginPageM=new LoginPageM(driver);
	 loginPageM.addUserNamePassWord("admin","admin");
	 loginPageM.clickSignIn();  
	 boolean dashBoardIsLoaded=loginPageM.isDashboardDisplayed();
	 System.out.println(dashBoardIsLoaded);
	 Assert.assertTrue(dashBoardIsLoaded, "dashboard is not loaded");
	 
  }
  public void verifyLoginUserpasswdtest2() // Correct Username and  wrong password
  {
	 LoginPageM loginPageM=new LoginPageM(driver);
	 loginPageM.addUserNamePassWord("admin","adminh");
	 loginPageM.clickSignIn();  
	 boolean loginAlertisDisplayed=loginPageM.isAlertDisplayed();
	 Assert.assertTrue(loginAlertisDisplayed, Constants.ERRORMESSAGEFOR);
  }
  
//Correct Username and  wrong password
  @Test(priority = 1,dataProvider ="SignInDeatils")
  public void verifyLoginUserpasswdtest3(String username , String password) 
  {
	 LoginPageM loginPageM=new LoginPageM(driver);
	 loginPageM.addUserNamePassWord(username,password);
	 loginPageM.clickSignIn();  
  }
  @DataProvider(name="SignInDeatils") 
  public Object[][] testData()
  {
	  Object data[][]= {{"admgin","1234"},{"admmin","admmin"},{"admin", "admin"}};
	  return data;
  }
  @Test
  //here the values passed through the signiNparaxml file
  @Parameters({"usernamep","passwordp"})
  public void verifyLoginUserpasswdtest4(String username , String password) 
  {
	 LoginPageM loginPageM=new LoginPageM(driver);
	 loginPageM.addUserNamePassWord(username,password);
	 loginPageM.clickSignIn();  
  }
}
