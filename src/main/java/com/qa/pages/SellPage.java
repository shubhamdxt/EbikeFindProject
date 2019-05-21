package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class SellPage extends BaseClass{
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement firstNameField;
	
	@FindBy(xpath="//input[@name='user_family_name']")
	WebElement familyNameFild;
	
	@FindBy(xpath="//input[@name='user_town']")
	WebElement townFild;
	
	@FindBy(xpath="(//input[@class='form-control'])[10]")
	WebElement searchAddrsFild;
	
	@FindBy(xpath="//label[@class=' control-label']")
	WebElement acceptPrivacyFild;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//a[text()='Sell']")
	WebElement sellLinkProductAdd;
	
	
	public SellPage()   {
		PageFactory.initElements(driver, this);
	}

	public void enterName() {
		firstNameField.clear();
		firstNameField.sendKeys("john");
	}
	
	public void enterFamilyName() {
		familyNameFild.clear();
		familyNameFild.sendKeys("singh");
	}
	
	public void enterTown() {
		townFild.clear();
		townFild.sendKeys("Noida");
	}
	
    public void enterSearchAddrs() {
    	searchAddrsFild.clear();
	searchAddrsFild.sendKeys("B 21, Block B, Sector 67, Noida, Uttar Pradesh 201301, India");
	}
    
    public void clickacceptPrivacyChk() {
    	acceptPrivacyFild.click();
    }
    
    public void clickSaveBtn() {
    	
    	saveBtn.click();
    }
    
    public AddProductPage clickForProdAdd() {
    	
    	sellLinkProductAdd.click();
    	
    	return new AddProductPage();
    }
}
