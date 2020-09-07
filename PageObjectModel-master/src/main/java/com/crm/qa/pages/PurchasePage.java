package com.crm.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
public class PurchasePage extends TestBase {

	@FindBy(css="[placeholder='First Last']")
	private WebElement firstName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="zipCode")
	private WebElement zipCode;

	@FindBy(id="cardType")
	private WebElement cardType;
	
	@FindBy(id="creditCardNumber")
	private WebElement creditCardNumber;
	
	@FindBy(id="creditCardMonth")
	private WebElement creditCardMonth;
	
	@FindBy(id="creditCardYear")
	private WebElement creditCardYear;
	
	@FindBy(id="nameOnCard")
	private WebElement nameOnCard;
	
	@FindBy(css="input[value='Purchase Flight']")
	private WebElement purchaseFlight;
	
	// Initializing the Page Objects:
	public PurchasePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * enter first last name
	 */
	public void enterName(String text) {
		enterText(firstName, text);
	}
	
	/**
	 * enter address
	 */
	public void enterAddress(String text) {
		enterText(address, text);
	}
	
	/**
	 * enter city
	 */
	public void enterCity(String text) {
		enterText(city, text);
	}
	
	/**
	 * enter state
	 */
	public void enterState(String text) {
		enterText(state, text);
	}
	
	/**
	 * enter zipcode
	 */
	public void enterZipCode(String text) {
		enterText(zipCode, text);
	}
	
	/**
	 * enter card type
	 */
	public void selectCardType(String option) {
		enterText(cardType, option);
	}
	
	/**
	 * enter card number
	 */
	public void enterCreditCardNumber(String text) {
		enterText(creditCardNumber, text);
	}
	/**
	 * enter month
	 */
	public void enterMonth(String text) {
		enterText(creditCardMonth, text);
	}
	/**
	 * enter year
	 */
	public void enterYear(String text) {
		enterText(creditCardYear, text);
	}
	
	/**
	 * enter year
	 */
	public void enterNameOnCard(String text) {
		enterText(nameOnCard, text);
	}
	/**
	 * click purchase flight
	 */
	public ConfirmationPage clickPurchaseFlight() {
		click(purchaseFlight);
		return PageFactory.initElements(driver, ConfirmationPage.class);
	}
}
