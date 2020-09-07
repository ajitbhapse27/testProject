package com.crm.qa.testcases;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ConfirmationPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.PurchasePage;
import com.crm.qa.pages.ReservePage;
import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebDriverUtils;
public class TestBookFlightTicket  {
	public WebDriver driver;
	TestBase testBase;
	String filePath = "login";
	String elementName = "testData";
	public static org.apache.logging.log4j.Logger log = LogManager.getLogger(TestBookFlightTicket.class.getName());
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverUtils utils = new WebDriverUtils();
		utils.initialization();
		driver = utils.getDriver();
		testBase = new TestBase(driver);
	}

	/*
	 * test method
	 */
	@Test
	public void verifyTicketBooking()  {
		
	Map<String,String> testData = TestUtil.getTestData("testData.json", "verifyTicketBooking");
	
	HomePage homePage = testBase.getHomePage();
	log.info("select departure city...");
	homePage.selectDepartureCity(testData.get("departureCity"));
	
	log.info("select destination city...");
	homePage.selectDestinationCity(testData.get("destinationCity"));
	
	log.info("click on find flights..");
	ReservePage reservePage = homePage.clickOnFindFights();

	log.info("click on choose this flight..");
	PurchasePage purchasePage = reservePage.clickChooseThisFlight();
	
	log.info("fill in the purchase flight form..");
	purchasePage.enterName(testData.get("name"));
	purchasePage.enterAddress(testData.get("address"));
	purchasePage.enterCity(testData.get("city"));
	purchasePage.enterState(testData.get("state"));
	purchasePage.enterZipCode(testData.get("zipCode"));
	purchasePage.selectCardType(testData.get("cardType"));
	purchasePage.enterCreditCardNumber(testData.get("creditCardNumber"));
	purchasePage.enterMonth(testData.get("month"));
	purchasePage.enterYear(testData.get("year"));
	purchasePage.enterNameOnCard(testData.get("nameOnTheCard"));
	
	ConfirmationPage confirmationPage = purchasePage.clickPurchaseFlight();
	
	Assert.assertEquals(confirmationPage.getStatus(), "PendingCapture");
		
	}
	
	@AfterMethod
	public void quite() {
		driver.close();
	}
}
