package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SellPage;

public class SellTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	SellPage  sellPage;
	

	public SellTest() 
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		sellPage=new SellPage();
	}
	
	
	/*@Test(priority=1)
	public void verifyName() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(5000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(5000);
		homePage.clickSellLink();
		Thread.sleep(2000);
		
		sellPage.enterName();
		
		Thread.sleep(2000);
		System.out.println("name link");
	}
	
	@Test(priority=2)
	public void verifyFamilyName() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(5000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(5000);
		homePage.clickSellLink();
		Thread.sleep(2000);
		sellPage.enterName();
		Thread.sleep(2000);
		
		sellPage.enterFamilyName();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void verifyTown() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(5000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(5000);
		homePage.clickSellLink();
		Thread.sleep(2000);
		sellPage.enterName();
		Thread.sleep(2000);
		sellPage.enterFamilyName();
		Thread.sleep(2000);
		sellPage.enterTown();
	}
	
	@Test(priority=4)
	public void verifySearchAdd() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(5000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(5000);
		homePage.clickSellLink();
		Thread.sleep(2000);
		sellPage.enterName();
		Thread.sleep(2000);
		sellPage.enterFamilyName();
		Thread.sleep(2000);
		sellPage.enterTown();
		Thread.sleep(2000);
		sellPage.enterSearchAddrs();
	}
	
	@Test(priority=5)
	public void verifyAcceptprivacy() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(5000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(5000);
		homePage.clickSellLink();
		Thread.sleep(2000);
		sellPage.enterName();
		Thread.sleep(2000);
		sellPage.enterFamilyName();
		Thread.sleep(2000);
		sellPage.enterTown();
		Thread.sleep(2000);
		sellPage.enterSearchAddrs();
		Thread.sleep(2000);
		sellPage.clickacceptPrivacyChk();
	}
	*/
/*	@Test(priority=6)
	public void verifySaveBtn() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(5000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(5000);
		homePage.clickSellLink();
		Thread.sleep(2000);
		sellPage.enterName();
		Thread.sleep(2000);
		sellPage.enterFamilyName();
		Thread.sleep(2000);
		sellPage.enterTown();
		Thread.sleep(2000);
		sellPage.enterSearchAddrs();
		Thread.sleep(2000);
		sellPage.clickacceptPrivacyChk();
		Thread.sleep(2000);
		sellPage.clickSaveBtn();
		Thread.sleep(2000);
		
		}*/
	
	@Test(priority=7)
	public void verifyProdAdd() throws Exception {
		loginPage.clickForDropTranlt();
		Thread.sleep(2000);
		loginPage.clickForSignIn();
		Thread.sleep(5000);
		homePage=loginPage.clickLoginBtn(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(5000);
		homePage.clickSellLink();
		Thread.sleep(2000);
		sellPage.enterName();
		Thread.sleep(2000);
		sellPage.enterFamilyName();
		Thread.sleep(2000);
		sellPage.enterTown();
		Thread.sleep(2000);
		sellPage.enterSearchAddrs();
		Thread.sleep(2000);
		sellPage.clickacceptPrivacyChk();
		Thread.sleep(2000);
		sellPage.clickSaveBtn();
		Thread.sleep(2000);
		sellPage.clickForProdAdd();
		Thread.sleep(2000);
		
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
