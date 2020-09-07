package apiTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;

import utils.RestUtils;
import utils.URLGenerator;

public class Tests {
	RestUtils rest;
	URLGenerator url;
	Response response;
	
	@BeforeMethod
	public void setup() {
		 rest = new RestUtils();
		 url = new URLGenerator("https://api.spacexdata.com");
		 response = rest.getData(url.latestURL);
	}
	
	/**
	 * Test to check status code of response
	 */
	@Test
	public void verifyStatusCode() {
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	/**
	 * Test to check flight number
	 */
	@Test
	public void verifyflightNumber() {
		JsonPath path = new JsonPath(response.getBody().asString());
		Assert.assertEquals(path.getString("flight_number"), "102");
	}
	
	/**
	 * Test to check header 
	 */
	@Test
	public void verifyHeader() {
			Headers head = response.getHeaders();
			Assert.assertEquals(head.getValues("Content-Type").toString(), "[application/json; charset=utf-8]");
		}
}
