package com.ibs.project.model;

import org.springframework.stereotype.Component;

@Component
public class StatusModel {

	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
}