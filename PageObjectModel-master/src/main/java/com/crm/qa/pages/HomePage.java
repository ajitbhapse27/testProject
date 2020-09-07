package com.crm.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
public class HomePage extends TestBase {
	
	public HomePage(WebDriver driver){
		super(driver);
		
	}
	
	// Page Factory - OR:
	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElement optDepartureCity;
	
	@FindBy(xpath = "//select[@name='toPort']")
	private WebElement optDestinationCity;
	
	@FindBy(xpath ="//input[@value='Find Flights']")
	private WebElement btnFindFlights;
	
	/**
	 * method to select departure city
	 * @param city
	 */
	public HomePage selectDepartureCity(String city) {
		try {
			selectOption(optDepartureCity,city);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	/**
	 * method to select destination city
	 * @param city
	 */
	public HomePage selectDestinationCity(String city) {
		try {
			selectOption(optDestinationCity,city);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	/**
	 * click on find 
	 */
	public ReservePage clickOnFindFights() {
		click(btnFindFlights);
		return PageFactory.initElements( driver, ReservePage.class);
	}

	
}
