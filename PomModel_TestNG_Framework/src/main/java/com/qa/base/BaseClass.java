package com.qa.base;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.qa.utils.CommonMethods;


public class BaseClass extends CommonMethods{
 public static WebDriver driver;
 public Properties prop;
 

  public WebDriver init_driver(Properties prop) {
     String browserName = "chrome";
     String url1 = "https://headsupfortails.com/";
	 if(browserName.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
	 }else if(browserName.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
	 }else if(browserName.equalsIgnoreCase("firefox")) {
		 driver = new FirefoxDriver();
	 }else {
		 System.out.println("Incorrect browserName " +browserName);
	 }
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get(url1);
	return driver;
  }
  public Properties init_prop() {
	 prop = new Properties();
	 try(FileInputStream ip = new FileInputStream(".src//test//resources//config//config.properties")){
		 prop.load(ip);
	 }catch(IOException e){
		 e.printStackTrace();
	 }
	 
	 return prop;
  }
//  public Properties ConfigFileReader() throws FileNotFoundException {
//		BufferedReader reader;
//		reader =new BufferedReader(new FileReader(PropertyFilePath));
//		prop = new Properties();
//		try {
//			prop.load(reader);
//			reader.close();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		return prop;
//		
//	  }
//   @AfterMethod
//   public void extentResultsAfterExecution(ITestResult result) {
//	   if(result.getStatus() == ITestResult.FAILURE) {
//		   logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "- Test Case Failed", ExtentColor.RED));
//		   
//	   }else if(result.getStatus() == ITestResult.SKIP) {
//		   logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ "-Test Case Skipped", ExtentColor.PINK));
//	   }else if(result.getStatus() == ITestResult.SUCCESS) {
//		   logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ "-Test Case Passes", ExtentColor.GREEN));
//	   }
//	  // driver.quit();
//   }


}
