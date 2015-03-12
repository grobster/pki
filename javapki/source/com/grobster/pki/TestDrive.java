package com.grobster.pki;

import java.io.*;

public class TestDrive {
	public static void main(String[] args) {
		Request r new Request("LOST", new PLMUser("Jeff", "Quarles", "Z00123ab", "jeffery.quarles@siemens.com", "Deb", "Siemens PLM", "000-000-000", "02-17-2012", new Address("123 Main St", "noville", "OH", "USA", "00000")), "complete on thurs.", Priority.RUSH);
		
		//String streetAddress, String city, String stateProvince, String country, String postalCode
		
		//String firstName, String lastName, String gid, String lte, String admin, String companyName, String phoneNumber, String hireDate, Address address
		
		//String reasonForReplacement, PLMUser user, String notes, Priority priority) 
		
		//System.out.println("
	}
}