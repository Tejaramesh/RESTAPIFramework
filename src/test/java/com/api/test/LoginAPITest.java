package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest {
	@Test
	public void login() {

		AuthService auth = new AuthService();
		LoginRequest payload = new LoginRequest();
		payload.setUsername("Teja");
		payload.setPassword("Teja@1234");
		Response resp = auth.login(payload);
		System.out.println(resp.asString());
		LoginResponse loginresponse = resp.as(LoginResponse.class);
		System.out.println(loginresponse.getToken());
		Assert.assertTrue(loginresponse.getToken() != null, "response token is invalid");

	}
}
