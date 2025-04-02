package com.practice.dto;

public class ValidateErrorResponse {
	private String usernameError;
	private String emailError;
	private String checkError;

	public String getUsernameError() {
		return usernameError;
	}

	public void setUsernameError(String usernameError) {
		this.usernameError = usernameError;
	}

	public String getEmailError() {
		return emailError;
	}

	public void setEmailError(String emailError) {
		this.emailError = emailError;
	}

	public String getCheckError() {
		return checkError;
	}

	public void setCheckError(String checkError) {
		this.checkError = checkError;
	}

	public ValidateErrorResponse(String usernameError, String emailError, String checkError) {
		super();
		this.usernameError = usernameError;
		this.emailError = emailError;
		this.checkError = checkError;
	}

	public ValidateErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
