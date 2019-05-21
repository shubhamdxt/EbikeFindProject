package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomeTest extends BaseClass{

	HomePage homePage;
	LoginPage loginPage;
	
	public HomeTest() 
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
	public void verifySellLink() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(2000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		System.out.println("sell link");
		Thread.sleep(2000);
		homePage.clickSellLink();
		Thread.sleep(2000);
		System.out.println("sell link");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
