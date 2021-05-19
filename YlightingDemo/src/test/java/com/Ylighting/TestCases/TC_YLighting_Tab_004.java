package com.Ylighting.TestCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Ylighting.PageObjects.LoginPage;
/*****************************************************
* CREATED BY: Dawood Shaik
* CREATED DATE: 17-05-2021
* APPLICATION NAME: YLighting
******************************************************/
public class TC_YLighting_Tab_004 extends BaseClass {
	@Test
	public void Login() throws Exception {

		driver.get(baseURL);
		LoginPage LoginTest = new LoginPage(driver);

		LoginTest.ClosePopup();
		LoginTest.Account();
		LoginTest.SignIn();		
		LoginTest.setEmail(Email);
		LoginTest.setPassword(Password);
		LoginTest.LoginButton();
		logger.info("User is able to login the application successfully");
		LoginTest.CEILING();
		LoginTest.AllChandeliers();
		LoginTest.Globechandeliers();
		LoginTest.Product();
		logger.info("user is able to select the product");
	
		
		
		
		
		
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,
				new File("C:\\Users\\dawoo\\eclipse-workspace\\YlightingDemo\\Screenshots\\T004.png"));

	}
 
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
