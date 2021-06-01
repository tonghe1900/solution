package com.cisco.demo.controller;

import com.cisco.demo.pojo.SignUpInfo;

public class QuerySignUpInfoResult {
	private SignUpInfo result;
	private String message;
	public QuerySignUpInfoResult(SignUpInfo result, String message) {
		this.result = result;
		this.message = message;
	}
	
	

}
