package com.api.models.request;

public class UpdateProfileRequest {
	private UpdateProfileRequest(String firstName, String lastName, String email, String mobileNumber, String username,
			int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.id = id;
	}

	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		private String email;
		private String mobileNumber;
		private String username;
		private int id;

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public UpdateProfileRequest build() {
			UpdateProfileRequest obj = new UpdateProfileRequest(firstName, lastName, email, mobileNumber, username, id);
			return obj;

		}
	}
}
