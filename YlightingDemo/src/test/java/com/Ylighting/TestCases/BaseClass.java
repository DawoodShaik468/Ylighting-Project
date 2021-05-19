package com.Ylighting.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Ylighting.Utilities.ReadConfig;
/*****************************************************
* CREATED BY: Dawood Shaik
* CREATED DATE: 17-05-2021
* APPLICATION NAME: YLighting
******************************************************/


public class BaseClass {
	 ReadConfig readConfig = new ReadConfig();
	    
	    
	    public String baseURL=readConfig.getApplicationURL();
	    public String FirstName=readConfig.getFirstName();	            
	    public String LastName=readConfig.getLastName();
	    public String Email =readConfig.getEmail();
	    public String ConfirmEmail=readConfig.getConfirmEmail();
	    public String Password=readConfig.getPassword();
	    public String ConfirmPassword=readConfig.getConfirmPassword();
	  
	    public static WebDriver driver;
	    public static Logger logger;
	  
			
	    @BeforeClass
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\dawoo\\eclipse-workspace\\YlightingDemo\\Drivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        logger = Logger.getLogger("YLighting");
			PropertyConfigurator.configure("Log4j.properties");
	    }
	    
		
	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	    public void captureScreen(WebDriver driver, String tname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}
	   
	}

