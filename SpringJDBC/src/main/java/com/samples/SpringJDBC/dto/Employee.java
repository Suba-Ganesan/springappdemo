package com.samples.SpringJDBC.dto;

public class Employee {
		private int eid;
		private String name;
		private String designation;
		private int salary;
		
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", name=" + name + ", designation=" + designation + ", salary=" + salary
					+ "]";
		}
		
	}