package com.grobster.pki;

import java.io.*;

public class User implements Serializable {
	private String logonName;
	private String password;
	private byte logonAccess; // used to access certain parts of the application / 0 = plm users / 1 = vendors / 2 = workers / 3 = admin
	private static final long serialVersionUID = 225935473722L;
	
	public User(String logonName, String password, byte logonAccess) {
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
	
	public void setLogonAccess(byte logonAccess) {
		this.logonAccess = logonAccess;
	}
	
	public String getLogonName() {
		return logonName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public byte getLogonAccess() {
		return logonAccess;
	}
}