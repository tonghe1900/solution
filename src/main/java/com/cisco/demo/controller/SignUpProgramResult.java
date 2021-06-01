package com.cisco.demo.controller;

import org.springframework.http.HttpStatus;

public class SignUpProgramResult {
	
	private String message;
	private HttpStatus httpStatus;
	
	SignUpProgramResult(HttpStatus httpStatus, String message){
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
	

}
