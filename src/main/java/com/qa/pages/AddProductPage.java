package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;
import com.qa.test.MyEbikesPage;

public class AddProductPage extends BaseClass{
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[1]")
	WebElement selectCategaryField;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement enterProdName;
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[2]")
	WebElement selectBrandField;
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[3]")
	WebElement selectModelField;
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[4]")
	WebElement selectSuspensionsField;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement enterProdActlPrice;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement enterProdSelPrice;
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	WebElement enterBatryCap;
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[5]")
	WebElement electMotorBrand;
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[6]")
	WebElement electMotorYear;
	
	@FindBy(xpath="(//input[@class='form-control'])[5]")
	WebElement enterMilegeFiled;
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[7]")
	WebElement frameMaterlField;
	
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[8]")
	WebElement frameSizeField;
	
	@FindBy(xpath="(//input[@class='form-control'])[6]")
	WebElement enterSupportSpFiled;
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[9]")
	WebElement selectWheelSizeField;
	
	/*@FindBy(xpath="(//select[@class='form-control s-icon2'])[10]")
	WebElement productAgeField;
	
	@FindBy(xpath="(//input[@class='form-control'])[7]")
	WebElement enterBatrryRechFiled;*/
	
	@FindBy(xpath="(//select[@class='form-control s-icon2'])[11]")
	WebElement genderField;
	
	@FindBy(xpath="//button[text()='SAVE']")
	WebElement saveBtn;
	
	@FindBy(xpath="//button[text()='Put your ad in evidence']")
	WebElement putEvntBtn;
	
	public AddProductPage()   {
		PageFactory.initElements(driver, this);
	}
	
	public String addProductPageTitle() 
	{
		
		return driver.getTitle();
	}
	
	public void selectCategory() {
		Select selectCat=new Select(selectCategaryField);
		selectCat.selectByVisibleText("City Urban ebikes");
	}
	
	public void enterProductname() {
		enterProdName.clear();                                           
		enterProdName.sendKeys("my product name");
	}
	
	public void selectBrand() {
		Select selectCat=new Select(selectBrandField);
		selectCat.selectByVisibleText("agogs");
	}
	
	/*public void selectModel() {
		Select selectCat=new Select(selectBrandField);
		selectCat.selectByVisibleText("altro - andere - autre - other - otro");
		System.out.println("model ");
	}*/
	
	public void selectSuspensions() {
		Select selectCat=new Select(selectSuspensionsField);
		selectCat.selectByVisibleText("hardtail");
	}
	
	public void enterActualPrice() {
		enterProdActlPrice.clear();
		enterProdActlPrice.sendKeys("200");
	}
	
	public void enterSellingPrice() {
		enterProdSelPrice.clear();
		enterProdSelPrice.sendKeys("300");
	}
	
	public void enterBatryCap() {
		enterBatryCap.clear();
		enterBatryCap.sendKeys("300mh");
	}
	public void selectElectMoterBrand() {
		Select elctmoterbrand=new Select(electMotorBrand);
		elctmoterbrand.selectByVisibleText("AKM");
	}
	
	public void selectElectMotorYear() {
		Select elctmoterbrand=new Select(electMotorYear);
		elctmoterbrand.selectByVisibleText("2018");
	}
	
	public void enterMileage() {
		enterMilegeFiled.sendKeys("80km/hr");
	}
	public void selectFrameMateril() {
		Select elctmoterbrand=new Select(frameMaterlField);
		elctmoterbrand.selectByVisibleText("aluminium");
	}
	
	public void selectFrameSize() {
		Select elctmoterbrand=new Select(frameSizeField);
		elctmoterbrand.selectByVisibleText("M");
	}
	public void enterSupportSp() {
		enterSupportSpFiled.clear();
		enterSupportSpFiled.sendKeys("50mk/hr");
	}
	public void selectWheelSize() {
		Select elctmoterbrand=new Select(selectWheelSizeField);
		elctmoterbrand.selectByVisibleText("29\"");
	}
	
	public void selectGender() {
		Select elctmoterbrand=new Select(genderField);
		elctmoterbrand.selectByVisibleText("man");
	}
	
	public HomePage clickSave() {
		
		saveBtn.click();
		
		 return new HomePage();
	}
}
