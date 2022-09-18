package com.samples.SpringCoreDI.propertyfile;

public class myDao {

	private String dbServer;
	private String dbPort;
	private String dbUser;
	private String dbPassword;
	
	public myDao(String dbServer, String dbPort, String dbUser, String dbPassword) {
		this.dbServer = dbServer;
		this.dbPort = dbPort;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "myDao [dbServer=" + dbServer + ", dbPort=" + dbPort + ", dbUser=" + dbUser + ", dbPassword="
				+ dbPassword + "]";
	}
}