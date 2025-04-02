package com.practice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {
	@NotBlank(message = "Username is required")
	@Size(min = 3, max = 8, message = "username must be between 3 to 9 characters")
	private String username;
	@NotBlank(message = "Email is required")
	@Email(message = "Enter Valid Email")
	private String email;

	private boolean isChecked;

	public LoginData(String username, String email, boolean isChecked) {
		super();
		this.username = username;
		this.email = email;
		this.isChecked = isChecked;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + ", isChecked=" + isChecked + "]";
	}

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

}
