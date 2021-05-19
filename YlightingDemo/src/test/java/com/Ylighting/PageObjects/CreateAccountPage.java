package com.Ylighting.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*****************************************************
* CREATED BY: Dawood Shaik
* CREATED DATE: 17-05-2021
* APPLICATION NAME: YLighting
******************************************************/
public class CreateAccountPage {
	WebDriver ldriver;

	public CreateAccountPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	/****************** Create Account WebElements ********************/
	
	@FindBy(xpath = "//header/div[2]/div[4]/ul[1]/li[2]/div[1]/button[1]/span[1]")
	WebElement Account;
	
	@FindBy(xpath = "//a[@id='my_account_hdr_link']")
	WebElement MyAccount;
	
	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_firstname']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_lastname']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_emailconfirm']")
	WebElement ConfirmEmail;
	
	@FindBy(xpath = "//input[@id='dwfrm_profile_login_password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='dwfrm_profile_login_passwordconfirm']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//span[contains(text(),'Create Account')]")
	WebElement CreateButton;
	
	@FindBy(className = "ltkpopup-close")
	WebElement ClosePopup;
	
	/****************** Create Account Actions ********************/
	
	public void Account() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(Account).perform();
		
	}
	
	public void MyAccount() {
		
		MyAccount.click();
	}
	public void setFirstName(String uname)
	{
		FirstName.sendKeys(uname);
	}
	public void setLastName(String uname)
	{
		LastName.sendKeys(uname);
	}
	public void setEmail(String uname)
	{
		Email.sendKeys(uname);
	}
	public void setConfirmEmail(String uname)
	{
		ConfirmEmail.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	public void setConfirmPassword(String pwd)
	{
		ConfirmPassword.sendKeys(pwd);
	}
	public void CreateButton()
	{
		//CreateButton.click();
		WebElement CreateButton =new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Create Account')]")));
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", CreateButton);
		//Actions action =new Actions(ldriver);
		//action.moveToElement(CreateButton).click().build().perform();
	}
	public void ClosePopup()
	{
		ClosePopup.click();
	}
	
}
