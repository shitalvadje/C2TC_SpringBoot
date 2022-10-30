package com.tns.di;

public class Job {
	String company;
	String profile;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Job(String company, String profile) {
		super();
		this.company = company;
		this.profile = profile;
	}
	
	public Job() {
		super();
	}
	
	@Override
	public String toString() {
		return "Job [company=" + company + ", profile=" + profile + "]";
	}

}
