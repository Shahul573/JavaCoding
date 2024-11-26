package org.excptn.test;

public class Employee {
public static void main(String[] args) {
	
	System.out.println("start");
	
	String s=null;
	
	try {
		System.out.println(s.length());
	} catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("dont divided by zero");
	}
	
	System.out.println("end");
			
}
}
