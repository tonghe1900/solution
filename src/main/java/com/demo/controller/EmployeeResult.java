package com.demo.controller;

import org.springframework.http.HttpStatus;

import com.demo.pojo.Employee;

public class EmployeeResult {
	
	private String message;
	private HttpStatus httpStatus;
	private Employee employee;
	
	EmployeeResult(HttpStatus httpStatus, String message){
		this.message = message;
		this.httpStatus = httpStatus;
	}
	
	EmployeeResult(HttpStatus httpStatus, String message, Employee employee){
		this.message = message;
		this.httpStatus = httpStatus;
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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
