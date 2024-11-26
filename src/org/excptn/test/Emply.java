package org.excptn.test;

public class Emply {
public static void main(String[] args) {
	
System.out.println("start");
	
	String s=null;
	
	try {
		System.out.println(s.length());
		System.out.println(3/0);
	} catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("dont divided by zero");
	}
	
	System.out.println("end");
			
	
	
	//try block will handle only one exception at a time
	
	
	
	
	
	
	
	
	
	
}
}
