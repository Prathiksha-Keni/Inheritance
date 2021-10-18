package com.xworkz.inheritance;

public class laptop 
{
	String name;
	String version;
	int ram;
	
	public  laptop(String name,String version,int ram) {
		this.name=name;
		this.version=version;
		this.ram=ram;
		
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.ram);
		System.out.println(this.version);
	}
}	
