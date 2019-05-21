package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Sell']")
	WebElement sellLink;
	
	
	public HomePage()   {
		PageFactory.initElements(driver, this);
	}
	
	public String homePageTitle() 
	{
		
		return driver.getTitle();
	}
	
	public void clickSellLink() {
		
		sellLink.click();
	}
}
