package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.utils.Constants;

import junit.framework.Assert;


public class HeadTailsTest extends BaseTest  {
    
	@Test
	public void headTailsTitleValidation() {
		String actualTitle = homePage.homepageTitle();
		System.out.println("Actual title is : "+actualTitle);
		Assert.assertEquals(actualTitle,Constants.HEADS_TAILS_TITLE );
		
		
	}
	@Test
	public void getPriceValidation() {
		homePage.searchProduct("pedigree adult food");
		searchPage.selectProduct();
		String headTailsPrice = productPage.getPrice();
		System.out.println("Head Tails price is " +headTailsPrice);
		//headTailsPrice.replace(0, 0)
		Assert.assertEquals(headTailsPrice, "242.10");
	}

}
