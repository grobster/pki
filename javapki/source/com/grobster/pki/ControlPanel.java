package com.grobster.pki;

import java.io.*;
import java.util.*;

public class ControlPanel implements Serializable{
	private static final long serialVersionUID = 357277532942L;
	private ArrayList<Request> pendingRequests;
	private ArrayList<Request> vendorRequests;
	private ArrayList<Request> completedRequests;
	private ArrayList<Request> archiveRequests;
	private ArrayList<Request> errorsRequests;
	
	public ControlPanel() {
		pendingRequests = new ArrayList<>();
		vendorRequests = new ArrayList<>();
		completedRequests = new ArrayList<>();
		archiveRequests = new ArrayList<>();
		errorsRequests = new ArrayList<>();
	}
	
	public void moveToPendingRequests(Request r) {
		pendingRequests.add(r);
	}
	
	public void moveToVendorRequests(Request r) {
		vendorRequests.add(r);
	}
	
	public void moveToCompletedRequests(Request r) {
		completedRequests.add(r);
	}
	
	public void moveToArchiveRequests(Request r) {
		archiveRequests.add(r);
	}
	
	public void moveToerrorsRequests(Request r) {
		errorsRequests.add(r);
	}
}