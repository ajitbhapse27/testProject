package com.crm.qa.base;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.pages.HomePage;
public class TestBase {

	public  WebDriver driver;
	public final static int MAXWAITTIME = 120;
	
	public static org.apache.logging.log4j.Logger log = LogManager.getLogger(TestBase.class.getName());

	public TestBase(WebDriver driver) {
			this.driver=driver;
	}
	
	/**
	 * wait for element to be visible
	 * @param element
	 */
	public void waitforElementToVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, MAXWAITTIME);
		wait.until(ExpectedConditions.or(
		    ExpectedConditions.visibilityOf(element)
		));
	}
	
	/**
	 *	wait for element to be clikable 
	 * @param element
	 */
	public void waitforElementToClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, MAXWAITTIME);
		wait.until(ExpectedConditions.or(
		    ExpectedConditions.elementToBeClickable(element)
		));
	}
	
	/**
	 * method to select options
	 * @param elem
	 * @param option
	 * @throws Exception
	 */
	public void selectOption(WebElement elem,String option) {
		waitforElementToVisible(elem);
		Select select = new Select(elem);
		List<WebElement> options = select.getOptions();
		for (WebElement opt : options) {
			if(opt.getText().trim().equals(option)) {
				select.selectByVisibleText(option);
				break;
			}
		}
	}
	
	/**
	 *	method to click on webelement 
	 * @param elem
	 */
	public void click(WebElement elem) {
		waitforElementToVisible(elem);
		waitforElementToClickable(elem);
		elem.click();
	}
	
	/**
	 * enter text into input box
	 * @param element
	 * @param text
	 */
	public void enterText(WebElement element,String text) {
		waitforElementToVisible(element);
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * method to return text of webelement
	 * @param element
	 * @return
	 */
	public String getText(WebElement element) {
		waitforElementToVisible(element);
		return element.getText();
	}
	
	public HomePage getHomePage() {
		return PageFactory.initElements(driver, HomePage.class);
	}
	
}
