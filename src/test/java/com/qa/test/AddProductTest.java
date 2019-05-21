package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.AddProductPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class AddProductTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	AddProductPage addProductPage;
	
	public AddProductTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		addProductPage=new AddProductPage();
	}
   
	@Test(priority=1)
	public void verifySelectCategory() throws Exception {
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
		addProductPage.selectCategory();
	}
	
	@Test(priority=2)
	public void verifyProductname() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void verifyBrandname() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void verifyModel() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		
		Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void verifySuspensions() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
		
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void verifyProdActulPrice() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
		
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
	}
	
	@Test(priority=7)
	public void verifySellingPrice() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
	
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	public void verifyBaterycap() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
	
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
	}
	
	@Test(priority=9)
	public void verifyElectMoterBrand() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
		
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
	}
	
	@Test(priority=10)
	public void verifyElectMoterYear() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
		
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
		addProductPage.selectElectMotorYear();
		Thread.sleep(2000);
	}
	
	@Test(priority=11)
	public void verifyElectMoterMileage() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
		
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
		addProductPage.selectElectMotorYear();
		Thread.sleep(2000);
		addProductPage.enterMileage();
		Thread.sleep(2000);
	}
	@Test(priority=12)
	public void verifyFrameMaterial() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
	
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
		addProductPage.selectElectMotorYear();
		Thread.sleep(2000);
		addProductPage.enterMileage();
		Thread.sleep(2000);
		addProductPage.selectFrameMateril();
		Thread.sleep(2000);
	}
	
	@Test(priority=13)
	public void verifyFrameSize() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
		
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
		addProductPage.selectElectMotorYear();
		Thread.sleep(2000);
		addProductPage.enterMileage();
		Thread.sleep(2000);
		addProductPage.selectFrameMateril();
		Thread.sleep(2000);
		addProductPage.selectFrameSize();
		Thread.sleep(2000);
	}
	
	@Test(priority=14)
	public void verifySupportSp() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
		
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
		addProductPage.selectElectMotorYear();
		Thread.sleep(2000);
		addProductPage.enterMileage();
		Thread.sleep(2000);
		addProductPage.selectFrameMateril();
		Thread.sleep(2000);
		addProductPage.selectFrameSize();
		Thread.sleep(2000);
		addProductPage.enterSupportSp();
		Thread.sleep(2000);
	}
	@Test(priority=15)
	public void verifyWheelSize() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
	
		Thread.sleep(2000);
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
		addProductPage.selectElectMotorYear();
		Thread.sleep(2000);
		addProductPage.enterMileage();
		Thread.sleep(2000);
		addProductPage.selectFrameMateril();
		Thread.sleep(2000);
		addProductPage.selectFrameSize();
		Thread.sleep(2000);
		addProductPage.enterSupportSp();
		Thread.sleep(2000);
		addProductPage.selectWheelSize();
		Thread.sleep(2000);
	}
	
	@Test(priority=16)
	public void verifyGender() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
	/*	addProductPage.selectModel();
		Thread.sleep(5000);*/
		System.out.println("model ");
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
		addProductPage.selectElectMotorYear();
		Thread.sleep(2000);
		addProductPage.enterMileage();
		Thread.sleep(2000);
		addProductPage.selectFrameMateril();
		Thread.sleep(2000);
		addProductPage.selectFrameSize();
		Thread.sleep(2000);
		addProductPage.enterSupportSp();
     	Thread.sleep(2000);
		addProductPage.selectWheelSize();
		Thread.sleep(2000);
		addProductPage.selectGender();
		Thread.sleep(2000);
	}
	
	@Test(priority=17)
	public void verifySaveBtn() throws Exception {
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
		addProductPage.selectCategory();
		Thread.sleep(2000);
		addProductPage.enterProductname();
		Thread.sleep(2000);
		addProductPage.selectBrand();
		Thread.sleep(2000);
	/*	addProductPage.selectModel();
		Thread.sleep(5000);*/
		System.out.println("model ");
		addProductPage.selectSuspensions();
		Thread.sleep(2000);
		addProductPage.enterActualPrice();
		Thread.sleep(2000);
		addProductPage.enterSellingPrice();
		Thread.sleep(2000);
		addProductPage.enterBatryCap();
		Thread.sleep(2000);
		addProductPage.selectElectMoterBrand();
		Thread.sleep(2000);
		addProductPage.selectElectMotorYear();
		Thread.sleep(2000);
		addProductPage.enterMileage();
		Thread.sleep(2000);
		addProductPage.selectFrameMateril();
		Thread.sleep(2000);
		addProductPage.selectFrameSize();
		Thread.sleep(2000);
		addProductPage.enterSupportSp();
     	Thread.sleep(2000);
		addProductPage.selectWheelSize();
		Thread.sleep(2000);
		addProductPage.selectGender();
		Thread.sleep(2000);
		addProductPage.clickSave();
		Thread.sleep(2000);
		System.out.println("All test");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
