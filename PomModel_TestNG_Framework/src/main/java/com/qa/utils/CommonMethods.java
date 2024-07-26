package com.qa.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.BaseClass;





public class CommonMethods {
	
	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "XPATH":
		 return BaseClass.driver.findElement(By.xpath(identifierValue));
		case "CSS":
			 return BaseClass.driver.findElement(By.cssSelector(identifierValue));
		case "ID":
			 return BaseClass.driver.findElement(By.id(identifierValue));
		case "NAME":
			 return BaseClass.driver.findElement(By.name(identifierValue));
		case "TAGNAME":
			 return BaseClass.driver.findElement(By.tagName(identifierValue));
			

		default:
			return null;
		}
	}

}
