package com.amdocs;

import java.util.HashMap;

public class Contacts {

	private HashMap<String, String> contacts;
	
	public Contacts() {
		this.contacts = new HashMap<String,String>();
	}
	public void addContact ( String name , String mobileNo) {
		
		contacts.put( mobileNo , name);
	}
	public String findContactNameByMobileNo(String mobileNo) {
		
		String name = contacts.get(mobileNo);
		
		if ( name == null )
			return mobileNo;
		
		return name;
	}
	
	public static void main(String[] args) {
		
		Contacts contacts = new Contacts();
		contacts.addContact("Rishi", "1234567890");
		contacts.addContact("Arun", "453623");
		
		String name  = contacts.findContactNameByMobileNo("1234567890");
		System.out.println(name);
		name  = contacts.findContactNameByMobileNo("5555555555");
		System.out.println( name );
	}
}
