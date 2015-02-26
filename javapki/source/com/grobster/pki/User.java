package com.grobster.pki;

import java.io.*;

public class User implements Serializable {
	private static final long serialVersionUID = 225935473722L;
	private String logonName;
	private String password;
	private int logonAccess; // used to access certain parts of the application / 0 = plm users / 1 = vendors / 2 = workers / 3 = admin
	
	
	public User(String logonName, String password, int logonAccess) {
		this.logonName = logonName;
		this.password = password;
		this.logonAccess = logonAccess;
	}
	
	public User() {}
	
	public void setLogonName(String logonName) {
		this.logonName = logonName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setLogonAccess(int logonAccess) {
		this.logonAccess = logonAccess;
	}
	
	public String getLogonName() {
		return logonName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getLogonAccess() {
		return logonAccess;
	}
}