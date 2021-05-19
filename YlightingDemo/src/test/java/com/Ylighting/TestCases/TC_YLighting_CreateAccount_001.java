package com.Ylighting.TestCases;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Ylighting.PageObjects.CreateAccountPage;
/*****************************************************
* CREATED BY: Dawood Shaik
* CREATED DATE: 17-05-2021
* APPLICATION NAME: YLighting
******************************************************/
public class TC_YLighting_CreateAccount_001 extends BaseClass {
	@Test
	public void CreateAccount() throws Exception {
		driver.get(baseURL);
		CreateAccountPage AccountCreation = new CreateAccountPage(driver);
		
		AccountCreation.ClosePopup();		
		AccountCreation.Account();
		AccountCreation.MyAccount();
		AccountCreation.setFirstName(FirstName);		
		AccountCreation.setLastName(LastName);
		AccountCreation.setEmail(Email);
		AccountCreation.setConfirmEmail(ConfirmEmail);
		AccountCreation.setPassword(Password);
		AccountCreation.setConfirmPassword(ConfirmPassword);	
		AccountCreation.CreateButton();
		logger.info("Account is created");
		
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,
				new File("C:\\Users\\dawoo\\eclipse-workspace\\YlightingDemo\\Screenshots\\T001.png"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
