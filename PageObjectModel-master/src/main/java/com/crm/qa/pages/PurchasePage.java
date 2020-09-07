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
	public PurchasePage enterName(String text) {
		enterText(firstName, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	
	/**
	 * enter address
	 * @return 
	 */
	public PurchasePage enterAddress(String text) {
		enterText(address, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	
	/**
	 * enter city
	 * @return 
	 */
	public PurchasePage enterCity(String text) {
		enterText(city, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	
	/**
	 * enter state
	 * @return 
	 */
	public PurchasePage enterState(String text) {
		enterText(state, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	
	/**
	 * enter zipcode
	 * @return 
	 */
	public PurchasePage enterZipCode(String text) {
		enterText(zipCode, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	
	/**
	 * enter card type
	 * @return 
	 */
	public PurchasePage selectCardType(String option) {
		enterText(cardType, option);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	
	/**
	 * enter card number
	 * @return 
	 */
	public PurchasePage enterCreditCardNumber(String text) {
		enterText(creditCardNumber, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	/**
	 * enter month
	 * @return 
	 */
	public PurchasePage enterMonth(String text) {
		enterText(creditCardMonth, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	/**
	 * enter year
	 * @return 
	 */
	public PurchasePage enterYear(String text) {
		enterText(creditCardYear, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	
	/**
	 * enter year
	 * @return 
	 */
	public PurchasePage enterNameOnCard(String text) {
		enterText(nameOnCard, text);
		return PageFactory.initElements(driver, PurchasePage.class);
	}
	/**
	 * click purchase flight
	 */
	public ConfirmationPage clickPurchaseFlight() {
		click(purchaseFlight);
		return PageFactory.initElements(driver, ConfirmationPage.class);
	}
}
