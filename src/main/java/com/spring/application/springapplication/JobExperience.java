package com.spring.application.springapplication;

public class JobExperience {

	private int id;
	private String companyName;
	private int duration;
	
	
	
	public JobExperience(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "JobExperience [id=" + id + ", companyName=" + companyName + ", duration=" + duration + "]";
	}
	
	
	
}
