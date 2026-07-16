package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.models.request.LoginRequest;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	private static final String BASEURL = "http://64.227.160.186:8080";
	RequestSpecification requestSpecification;

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
		return requestSpecification.contentType("application/json").log().all().body(payload).when().put(endpoint);

	}

}
