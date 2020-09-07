package utils;

public class URLGenerator {

	// For API
	private String REST_ENDPOINT = "/launches";
	private String API_VERSION = "/v4";

	//Full EndPoint URLs
	public String latestURL = "/latest";
		
	public URLGenerator(String instanceURL) {
		
		String baseURL = instanceURL+API_VERSION+REST_ENDPOINT;
		
		this.latestURL = baseURL + this.latestURL;
		
	}
}
