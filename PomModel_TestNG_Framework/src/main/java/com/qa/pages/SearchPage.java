package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	private WebDriver driver;
	private By headTailsProduct = By.xpath("(//figure[@class='st-product-media']//a)[1]");
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	public ProductPage selectProduct() {
		driver.findElement(headTailsProduct).click();
		return new ProductPage(driver);
	}

}
