package com.xworkz.inheritance;

public class PhonePayTest 
{
	public static void displayInfo(PhonePay obj[]) 
	{
		System.out.println("Phone-Pay information");
		for (int i = 0; i < obj.length; i++) {
				System.out.println(obj[i].name);
				System.out.println(obj[i].version);
				System.out.println(obj[i].releaseYear);
				System.out.println("------------------");}
	}
	public static void main(String[] args) 
	{
		PhonePay Phonepayv01 = new PhonePay("Phone-pay", "V01", 2008);
		PhonePay Phonepayv02 = new PhonePay("Phone-pay", "V02", 2010);
		PhonePay Phonepayv03 = new PhonePay("Phone-pay", "V03", 2012);
		PhonePay Phonepayv04 = new PhonePay("Phone-pay", "V04", 2014);
		PhonePay Phonepayv05 = new PhonePay("Phone-pay", "V05", 2017);
		PhonePay Phonepayv06 = new PhonePay("Phone-pay", "V06", 2018);
		
		PhonePay obj[]= {Phonepayv01,Phonepayv02,Phonepayv03};
		PhonePayTest.displayInfo(obj);
	}

}
