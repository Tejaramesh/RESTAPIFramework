package com.api.utils;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class Authorization {

	public String getToken() {
		AuthService au = new AuthService();
		LoginRequest loginpayload = new LoginRequest();
		loginpayload.setUsername("Teja");
		loginpayload.setPassword("Teja@1234");
		Response resp = au.login(loginpayload);
		LoginResponse response = resp.as(LoginResponse.class);
		return response.getToken();

	}
}
