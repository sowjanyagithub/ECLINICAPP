package com.vibgyor.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vibgyor.generic.BasePage;


public class LoginPage extends BasePage
{
	//Declaration
	@FindBy(id="username")
	private WebElement loginTB;
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(className="button")
	private WebElement connectionBTN;
	 
	//Initialization
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//Utilization
	//verify the title
	public void verifyTheTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}

	//Enter the username
	public void enterLoginId(String un)
	{
		loginTB.sendKeys(un);
	}
	
	//Enter the password
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	//Click on connection button
	public void clickOnConnectionButton()
	{
		connectionBTN.click();
	}
}