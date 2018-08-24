package com.vibgyor.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.vibgyor.generic.BaseTest;
import com.vibgyor.generic.ExcelData;
import com.vibgyor.pages.LoginPage;
import com.vibgyor.pages.NewGroupPage;

public class NewGroupTest extends BaseTest
{
	@Test(priority=1)
	public void testValidLoginLogout()
	{
		String groupcardTitle=ExcelData.getData("file_path", "TC04", 1, 0);
		String name=ExcelData.getData("file_path", "TC04", 1, 1);
		String note=ExcelData.getData("file_path", "TC04", 1, 2);
		String eTitle=ExcelData.getData("file_path", "TC04", 1, 3);
		
		LoginPage lp=new LoginPage(driver);
		NewGroupPage gp=new NewGroupPage(driver);
		
		//Verify the login page
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
		lp.verifyTheTitle(eTitle);
			
		//verify login page
		lp.verifyTitle(eTitle);
		//click on logout
		gp.logOutButton();
	
	}

}