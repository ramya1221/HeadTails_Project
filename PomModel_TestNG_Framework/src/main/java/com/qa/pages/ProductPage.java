package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	private WebDriver driver;
	private By headTailsSize = By.xpath("//label[@data-value='1 kg']");
	private By headTailsPrice = By.xpath("//span[@class = 'price-item price-item--sale price-item--last']");
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
   public String getPrice() {
	   driver.findElement(headTailsSize).click();
	   String price = driver.findElement(headTailsPrice).getText();
	   return price;
	
}
}
