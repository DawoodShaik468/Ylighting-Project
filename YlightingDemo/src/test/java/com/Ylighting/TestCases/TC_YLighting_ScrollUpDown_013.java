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
public class TC_YLighting_ScrollUpDown_013 extends BaseClass {
	@Test
	public void Login() throws Exception {

		driver.get(baseURL);
		LoginPage LoginTest = new LoginPage(driver);

		LoginTest.ClosePopup();	
		LoginTest.Scrolldown();
		logger.info("ScrolledDown successfully");
		//LoginTest.Scrollup();
		//System.out.println("Scrolled Up");
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,
				new File("C:\\Users\\dawoo\\eclipse-workspace\\YlightingDemo\\Screenshots\\T013.png"));
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
