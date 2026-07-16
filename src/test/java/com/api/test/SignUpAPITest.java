package com.api.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;
import com.api.models.request.SignUpRequest.Builder;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class SignUpAPITest {

	@Test()
	public void signUp() {

		SignUpRequest signUpRequest = new SignUpRequest.Builder().username("dscxtest").email("test56232@user.com")
				.firstName("tesa").password("Test@1234").confirmPassword("Test@1234").lastName("dvfss")
				.mobileNumber("8765456744").build();

		AuthService auth = new AuthService();
		Response signUpResp = auth.signUp(signUpRequest);
		 
		
	}
}
