package com.qa.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']")
	WebElement transBtn;
	
	@FindBy(xpath="//a[text()=' English ']")
	WebElement engLang;
	
	@FindBy(xpath="(//a[text()='Sign in/ Sign up'])[1]")
	WebElement signInLink;
	
	@FindBy(xpath="(//input[@name='email'])[1]")        
	WebElement emaiId;
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	public LoginPage()   {
		PageFactory.initElements(driver, this);
	}

	
	public String loginPageTitle() 
	{
		
		return driver.getTitle();
	}
	
    
	public void clickForDropTranlt() throws Exception 
    {
		
		driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=' English ']")).click();
    
	   
	 }

	
	
	public void clickForSignIn() {
		
		signInLink.click();
	}
	
	public HomePage clickLoginBtn(String emil,String pass) throws Exception {
		Thread.sleep(2000);
		emaiId.clear();
		emaiId.sendKeys(emil);
	
		Thread.sleep(2000);
		password.clear();
		password.sendKeys(pass);
		Thread.sleep(2000);
		
		loginBtn.click();
		return new HomePage();
	}
}
