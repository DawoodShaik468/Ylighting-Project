package com.Ylighting.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Ylighting.PageObjects.LoginPage;
/*****************************************************
* CREATED BY: Dawood Shaik
* CREATED DATE: 17-05-2021
* APPLICATION NAME: YLighting
******************************************************/
public class TC_YLighting_LiveChat2_010 extends BaseClass {
	@Test
	public void Login() throws Exception {

		driver.get(baseURL);
		LoginPage LoginTest = new LoginPage(driver);

		LoginTest.ClosePopup();	
		logger.info("Popup is closed");
		LoginTest.LiveChat();
		logger.info("Live Chat is clicked");
		LoginTest.LiveChat_Name();
		logger.info("Live Chat Name is entered");
		LoginTest.LiveChat_Email2();
		logger.info("Live Chat Email is entered");
		LoginTest.LiveChat_Submit();
		logger.info("Live Chat submit is clicked");
	
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,
				new File("C:\\Users\\dawoo\\eclipse-workspace\\YlightingDemo\\Screenshots\\T010.png"));
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}

