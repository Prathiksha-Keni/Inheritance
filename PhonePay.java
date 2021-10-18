package com.xworkz.inheritance;

public class PhonePay 
{
	String name;
	String version;
	int releaseYear;
	
	public  PhonePay(String name,String version,int releaseYear) {
		this.name=name;
		this.version=version;
		this.releaseYear=releaseYear;
		
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.version);
		System.out.println(this.releaseYear);
		
	}
}
