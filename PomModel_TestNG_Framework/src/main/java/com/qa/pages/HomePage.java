package com.qa.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.base.BaseClass;
import com.qa.utils.*;


public class HomePage extends BaseClass{
  private WebDriver driver;
  private By headTailSearchBar =By.xpath("//*[@id=\"huftproductsearch\"]");
  public HomePage(WebDriver driver) {
	  this.driver = driver;
  }

public String homepageTitle() {
	  return driver.getTitle();
	
}
 public SearchPage searchProduct(String searchName) {
	 driver.findElement(headTailSearchBar).sendKeys(searchName,Keys.ENTER);
	 return new SearchPage(driver);
	
}

}
