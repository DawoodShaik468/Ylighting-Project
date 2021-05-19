package com.Ylighting.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
/*****************************************************
* CREATED BY: Dawood Shaik
* CREATED DATE: 17-05-2021
* APPLICATION NAME: YLighting
******************************************************/

//Read from config.properties and baseClass is executed using methods readConfig
public class ReadConfig {
  Properties Pro;//pro is object
  public ReadConfig()
  {
      //src is varibale
      File src = new File("C:\\Users\\dawoo\\eclipse-workspace\\YlightingDemo\\Configurations\\config.properties");
      try {
          FileInputStream fis = new FileInputStream(src);//to read data we use fileinputstream
          Pro= new Properties();
          Pro.load(fis);//load is method 
      }catch (Exception e) {
          System.out.println("Exception is" + e.getMessage());
      }
  }

  public String getApplicationURL()
  {
      String baseurl=Pro.getProperty("baseURL");
      return baseurl;
      
  }
  public String getFirstName()
  {
      String FirstName=Pro.getProperty("FirstName");
      return FirstName;
      
  }
  
  public String getLastName() {
      String LastName=Pro.getProperty("LastName");
      return LastName;
      
  }

  
  public String getEmail() {
      
      String getEmail=Pro.getProperty("Email");
      return getEmail;
  }
  
  public String getConfirmEmail() {
      String ConfirmEmail=Pro.getProperty("ConfirmEmail");
      return ConfirmEmail;
      }



  public String getPassword()
  {
      String Password=Pro.getProperty("Password");
      return Password;
      
}
  
  public String getConfirmPassword() {
      String ConfirmPassword=Pro.getProperty("ConfirmPassword");
      return ConfirmPassword;
      }
  
  public String getChrompath()
  {
      String Chrompath =Pro.getProperty("Chrompath");
      return Chrompath;
  }
}

