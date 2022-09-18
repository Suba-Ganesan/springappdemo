package com.samples.SpringCoreDI;

import java.util.List;

public class Hospital {

	private String name;
	private List<String> patients;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getpatients() {
		return patients;
	}
	public void setpatients(List<String> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", patients=" + patients + "]";
	}
	
}
