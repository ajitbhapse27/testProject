package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class ConfirmationPage extends TestBase{

	public ConfirmationPage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath="//td[text()='Status']//following-sibling::td[text()='PendingCapture']")
	private WebElement status;
	
	
	/**
	 * get status 
	 */
	
	public String getStatus() {
		return getText(status);
	}
	
	
}
