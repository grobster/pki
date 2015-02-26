package com.grobster.pki;

import java.io.*;

public class Request implements Serializable{
	private static final long serialVersionUID = 788965552325L;
	private String reasonForReplacement;
	private PLMUser user;
	private byte picture[];
	private String notes;
	private Priority priority;
	private static int requestNumber;
	
	public enum Priority {
		NORMAL, RUSH
	}
	
	public Request(String reasonForReplacement, PLMUser user, byte picture[], String notes, Priority priority) { // everything constructor
		this.reasonForReplacement =  reasonForReplacement;
		this.user = user;
		this.picture = picture;
		this.notes = notes;
		this.priority = priority;
		requestNumber++;
	}
	
	public Request(String reasonForReplacement, PLMUser user, String notes, Priority priority) { // no picture constructor
		this.reasonForReplacement =  reasonForReplacement;
		this.user = user;
		this.notes = notes;
		this.priority = priority;
		requestNumber++;
	}
	
	public Request(String reasonForReplacement, PLMUser user, String notes) { // no picture & no priority constructor
		this.reasonForReplacement =  reasonForReplacement;
		this.user = user;
		this.notes = notes;
		requestNumber++;
		priority = priority.NORMAL;
	}
	
	public Request() {
		requestNumber++;
	}
	
}