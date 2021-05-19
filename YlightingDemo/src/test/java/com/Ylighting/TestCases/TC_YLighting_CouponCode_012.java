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
public class TC_YLighting_CouponCode_012 extends BaseClass {
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
		LoginTest.Filter();
		logger.info("Applied Filter");
		LoginTest.Product();
		logger.info("user is able to select the product");
		LoginTest.Addcart();
		logger.info("user is able to add the selected product to the cart");
		LoginTest.Checkout();
		logger.info("user is able to view  the added product in the cart");
		LoginTest.Coupon();
		logger.info("user is able to enter coupon code");
		LoginTest.Apply();
		logger.info("Coupon Code is Applied");
		
		
		
		
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,
				new File("C:\\Users\\dawoo\\eclipse-workspace\\YlightingDemo\\Screenshots\\T012.png"));

	}
 
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
