package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetUserAPI {
	@Test
	public void getUser() {
		AuthService au = new AuthService();
		LoginRequest loginpayload = new LoginRequest();
		loginpayload.setUsername("Teja");
		loginpayload.setPassword("Teja@1234");
		Response request = au.login(loginpayload);
		LoginResponse response = request.as(LoginResponse.class);
		System.out.println(response.getToken());

		UserManagementService ums = new UserManagementService();
		Response getresponse = ums.getprofile(response.getToken());
		UserProfileResponse profileres = getresponse.as(UserProfileResponse.class);
		System.out.println(getresponse.asPrettyString());
		Assert.assertTrue(profileres.getMobileNumber().equals("7760287566"), "Invalid mobile number");

	}

}
