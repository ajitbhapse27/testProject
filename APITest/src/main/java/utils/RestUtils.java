package utils;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class RestUtils {
	/**
	 * 
	 * @param url
	 * @return
	 */
	public Response getData(String url) {
		return RestAssured.given()
				.header("Content-Type", "application/json")
				.get(url);
	}
}
