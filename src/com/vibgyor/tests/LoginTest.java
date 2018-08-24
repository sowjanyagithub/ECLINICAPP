package com.vibgyor.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.vibgyor.generic.BaseTest;
import com.vibgyor.generic.ExcelData;
import com.vibgyor.pages.HomePage;
import com.vibgyor.pages.LoginPage;
import com.vibgyor.pages.NewGroupPage;

public class LoginTest extends BaseTest
{
	@Test(priority=1)
	public void testValidLoginLogout()
	{
		String loginTitle=ExcelData.getData(file_path, "TC01", 1, 2);
		String login=ExcelData.getData(file_path, "TC01", 1, 0);
		String password=ExcelData.getData(file_path, "TC01", 1, 1);
		String Title1=ExcelData.getData(file_path, "TC01", 1, 3);
		String Title2=ExcelData.getData(file_path, "TC03", 1, 0);
		String groupcardTitle=ExcelData.getData(file_path, "TC04", 1, 0);
		String name=ExcelData.getData(file_path, "TC04", 1, 1);
		String note=ExcelData.getData(file_path, "TC04", 1, 2);
		String Title3=ExcelData.getData(file_path, "TC04", 1, 3);

		
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		NewGroupPage gp=new NewGroupPage(driver);


		
		//Verify the login page
		lp.verifyTheTitle(loginTitle);
		//Enter Valid Username
		Reporter.log("Username is:"+login,true);
		lp.enterLoginId(login);
		
		//enter valid password
		Reporter.log("Password is:"+password,true);
		lp.enterPassword(password);
		
		//click on login
		lp.clickOnConnectionButton();
		
		//verify title
		lp.verifyTheTitle(Title1);
		
		//Verify the title
		//lp.verifyTheTitle(Title2);
		
		//click on login
		hp.clickOnUsersAndGroupsSubmenu();
		lp.verifyTheTitle(Title2);
		hp.clickOnNewGroupLink();
		
		//Verify the title
		lp.verifyTheTitle(groupcardTitle);

				//Enter Valid groupname
				Reporter.log("Groupname is:"+name,true);
				gp.groupName(name);
				
				//enter valid password
				Reporter.log("Note is:"+note,true);
				gp.note(note);
				
				//click on login
				gp.clickOnCreateGroupButton();
				
				//verify enter time track
				//lp.verifyTheTitle(eTitle1);
					
				//verify login page
			//	lp.verifyTitle(eTitle1);
				//click on logout
			//	gp.logOutButton();
		
	
	}

}