package com.cisco.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.cisco.demo.pojo.SignUpInfo;
import com.cisco.demo.pojo.Tutorial;

@Service
public class SignUpService {
	
	private static final String VISUAL_STUDIO_CODE_JAVASCRIPT = "Visual Studio Code/Javascript";
	SignUpService(){
		tutorials.put(VISUAL_STUDIO_CODE_JAVASCRIPT, new Tutorial("VISUAL_STUDIO_CODE_JAVASCRIPT", "VISUAL_STUDIO_CODE_JAVASCRIPT"));
		tutorials.put("JAVA", new Tutorial("JAVA", "JAVA"));
	}

	private ConcurrentHashMap<String,SignUpInfo > data  = new ConcurrentHashMap<>();
	
	private ConcurrentHashMap<String, Tutorial> tutorials  = new ConcurrentHashMap<>();
	public  boolean saveSignUpInfo(SignUpInfo signUpInfo) {
		data.put(signUpInfo.getId(), signUpInfo);
		return true;
		
	}
	public SignUpInfo findSignUpInfo(String id) {
		return  data.get(id);
		
	}
	public Tutorial getTutorial(String id) {
		SignUpInfo signUpInfo = data.get(id);
		if(signUpInfo == null) {
			//provide the default Tutorial
			return tutorials.get(VISUAL_STUDIO_CODE_JAVASCRIPT);
		}
		return tutorials.get(signUpInfo.getDevelopment_environment());
		
	}
	public Map<String, List<SignUpInfo>> getGroupedInfo() {
		Map<String, List<SignUpInfo>> res = new HashMap<>();
		for(String key: data.keySet()) {
			SignUpInfo signUpInfo = data.get(key);
			if(!res.containsKey(signUpInfo.getLocation())) {
				res.put(signUpInfo.getLocation(), new ArrayList<>());
			}
			res.get(signUpInfo.getLocation()).add(signUpInfo);
		}
		return res;
	}
	

}
