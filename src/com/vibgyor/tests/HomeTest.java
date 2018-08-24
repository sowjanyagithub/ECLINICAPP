package com.vibgyor.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.vibgyor.generic.BaseTest;
import com.vibgyor.generic.ExcelData;
import com.vibgyor.pages.HomePage;
import com.vibgyor.pages.LoginPage;

public class HomeTest extends BaseTest
{
	@Test(priority=2)
	public void testValidLoginLogout()
	{
		String Title=ExcelData.getData(file_path, "TC03", 1, 0);
		
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		
		//Verify the title
		lp.verifyTheTitle(Title);
		
		//click on login
		hp.clickOnUsersAndGroupsSubmenu();
		hp.	clickOnNewGroupLink();
		
		//Verify the title
		lp.verifyTheTitle(Title);
		
	}

}