package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	private static final String BASEURL = "http://64.227.160.186:8080";
	RequestSpecification requestSpecification;

	static {
		RestAssured.filters(new LoggingFilter());
	}

	public BaseService() {
		requestSpecification = given().baseUri(BASEURL);
	}

	protected Response postRequest(Object payload, String endpoint) {
		return requestSpecification.contentType("application/json").body(payload).when().post(endpoint);
	}

	protected Response getRequest(String endpoint) {
		return requestSpecification.contentType("application/json").when().get(endpoint);
	}

	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization", "Bearer " + token);
	}

	protected Response putRequest(Object payload, String endpoint) {
		return requestSpecification.contentType("application/json").body(payload).when().put(endpoint);

	}

}
