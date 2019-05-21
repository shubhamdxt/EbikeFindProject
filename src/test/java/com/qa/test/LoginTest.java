package com.qa.test;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	
	public LoginTest() 
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		/*dashboardPage=new DashboardPage();*/
	}
	
	
	@Test(priority=1)
	public void verifyTranstBtn() throws Exception {
		
		Thread.sleep(2000);
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void verifiySignIn() throws Exception {
		
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void verifyLogin() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(2000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(2000);
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
