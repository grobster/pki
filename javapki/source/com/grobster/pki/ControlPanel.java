package com.grobster.pki;

import java.io.*;
import java.util.*;

public class ControlPanel implements Serializable{
	private ArrayList<Request> pendingRequests;
	private ArrayList<Request> vendorRequests;
	private ArrayList<Request> completedRequests;
	private ArrayList<Request> archiveRequests;
	private ArrayList<Request> errorsRequests;
}