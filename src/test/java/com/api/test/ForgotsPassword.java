package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotsPassword {
	@Test
	public void forgotPassword() {
		AuthService auth = new AuthService();
		Response forgotpasswordResp = auth.forgotPassword("tejaramesh2000@gmail.com");
		System.out.println(forgotpasswordResp.asPrettyString());

	}

}
