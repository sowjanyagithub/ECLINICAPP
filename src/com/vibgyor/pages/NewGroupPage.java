package com.vibgyor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewGroupPage 
{
	@FindBy(name="nom")
	private WebElement groupName;
	
	@FindBy(name="note")
	private WebElement noteDesc;
	
	@FindBy(className="button")
	private WebElement creategroupBTN;
	
	@FindBy(className="login")
	private WebElement clickonLogout;
	
	//Initialization
		public NewGroupPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		//Enter the new group name
		public void groupName(String gn)
		{
			groupName.sendKeys(gn);
		}	
		//Enter the new note
		public void note(String note)
		{
			noteDesc.sendKeys(note);
		}	
		//Click on connection button
		public void clickOnCreateGroupButton()
		{
			creategroupBTN.click();
		}
		public void logOutButton()
		{
			clickonLogout.click();
		}
}
