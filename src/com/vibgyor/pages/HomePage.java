package com.vibgyor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vibgyor.generic.BasePage;

public class HomePage extends BasePage
{
	//Declaration
	@FindBy(className="vmenu")
	private WebElement usersandgroupsMenu;
	
	@FindBy(xpath="//a[@href='/dolibarr-3.3.1/htdocs/user/home.php?leftmenu=users']")
	private WebElement newGroupLink;
	
	//Initialization
		public HomePage(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		//Utilization
		
		//Click on users and groups submenu button
		public void clickOnUsersAndGroupsSubmenu()
		{
			usersandgroupsMenu.click();
		}
		//Click on new group link
		public void clickOnNewGroupLink()
		{
			newGroupLink.click();
		}
	
}
