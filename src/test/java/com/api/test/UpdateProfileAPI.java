package com.api.test;

import org.testng.annotations.Test;

import com.api.base.UserManagementService;
import com.api.models.request.UpdateProfileRequest;
import com.api.utils.Authorization;

import io.restassured.response.Response;

public class UpdateProfileAPI {

	@Test
	public void updateProfile() {
		Authorization auth = new Authorization();
		String token = auth.getToken();
		UserManagementService user = new UserManagementService();
		UpdateProfileRequest reqPayload = new UpdateProfileRequest.Builder().firstName("Teja").lastName("r")
				.username("Teja").id(5687).email("tejarsmesh@gmail.com").mobileNumber("8217578543").build();
		Response respo = user.updateProfile(token, reqPayload);
		System.out.println(respo.asPrettyString());
		System.out.println(respo.getTime());

	}

}
