package com.crm.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
public class ReservePage extends TestBase {

	// This is dynamic webElement... we can select as per the user input
	@FindBy(xpath = "//td[text()='Virgin America']//parent::tr//descendant::input[@value='Choose This Flight']")
	private WebElement clickChooseThisFlight;
	
	// Initializing the Page Objects:
	public ReservePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * click on choose this flight
	 * @return 
	 */
	public PurchasePage clickChooseThisFlight() {
		click(clickChooseThisFlight);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	
}
