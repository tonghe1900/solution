package com.cisco.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.cisco.demo.pojo.SignUpInfo;
import com.cisco.demo.pojo.Tutorial;
import com.cisco.demo.service.SignUpService;

//1. Marketing: Interact with the developer via both email and social media.
//2. Business Development: Segment the developers into cohorts based on location and
//industry.
//3. Product Management: Decide what samples, tutorials are needed based on the
//development environment of the developer.
@RestController
public class SignUpController {
	public static final String SIGN_UP_SUCCESSFULLY = "sign up successfully";
	@Autowired
	private SignUpService signUpService;
	@PostMapping("/programs/signup")
	public SignUpProgramResult signUpProgram(
	  @RequestBody SignUpInfo signUpInfo) {
	 
		signUpService.saveSignUpInfo(signUpInfo);
		
	    return new SignUpProgramResult(HttpStatus.OK, SIGN_UP_SUCCESSFULLY);
	   
	}
	
	

	
	@GetMapping("/programs/signup/{id}")
	public SignUpInfo getSignUpProgramInfo(@PathVariable String id) {
		SignUpInfo result =  signUpService.findSignUpInfo(id);
		return result;
		
	    
	}
	
	@GetMapping("/programs/tutorials/{id}")
	public Tutorial getTutorials(@PathVariable String id) {
		Tutorial result =  signUpService.getTutorial(id);
		return result;
		
	    
	}
	
	@GetMapping("/programs/info/group")
	public Map<String, List<SignUpInfo>> getGroupedInfo() {
		Map<String, List<SignUpInfo>> map =  signUpService.getGroupedInfo();
		return map;
		
	    
	}
	
	
	
	
	
	

}
