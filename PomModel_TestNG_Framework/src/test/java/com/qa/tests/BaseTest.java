package com.qa.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.ProductPage;
import com.qa.pages.SearchPage;
import com.qa.utils.Constants;

import junit.framework.Assert;

public class BaseTest extends BaseClass{
 WebDriver driver;
 Properties prop;
 BaseClass bc;
 ExtentReports extent;
 HomePage homePage;
 HeadTailsTest headTailsTest;
 SearchPage searchPage;
 ProductPage productPage;
 
 @BeforeTest
 public void setup() throws IOException {
   bc = new BaseClass();
   prop = bc.init_prop();
   driver = bc.init_driver(prop);
   homePage = new HomePage(driver);
   searchPage = new SearchPage(driver);
   productPage = new ProductPage(driver);
   	
   	}

 @AfterTest
 public void tearDown() {
	// driver.quit();
	// extent.flush();
	
 }
}
