package com.xworkz.inheritance;

import java.util.Iterator;

public class laptopTest {
	
	public static void displayInfo(laptop obj[]) {
		System.out.println("Laptop information");
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].ram>4) {
				System.out.println(obj[i].name);
				System.out.println(obj[i].version);
				System.out.println(obj[i].ram);
				System.out.println("------------------");
			}
		}
	}

	public static void main(String[] args) {

		laptop laptopv01 = new laptop("HP", "V01", 8);
		laptop laptopv02 = new laptop("HP", "V02", 4);
		laptop laptopv03 = new laptop("HP", "V03", 2);
		laptop laptopv04 = new laptop("HP", "V04", 32);
		laptop laptopv05 = new laptop("HP", "V05", 4);
		laptop laptopv06 = new laptop("HP", "V06", 16);
		
		laptop obj[]= {laptopv01,laptopv02,laptopv03,laptopv04,laptopv05,laptopv06};
		laptopTest.displayInfo(obj);
	}

}
