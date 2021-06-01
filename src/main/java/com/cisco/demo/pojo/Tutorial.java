package com.cisco.demo.pojo;

public class Tutorial {
	private String devEnv;
	private String name;

	public String getDevEnv() {
		return devEnv;
	}

	public void setDevEnv(String devEnv) {
		this.devEnv = devEnv;
	}

	public Tutorial(String devEnv, String name) {
		super();
		this.devEnv = devEnv;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
