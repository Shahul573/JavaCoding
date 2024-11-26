package org.excptn.test;

public class Super {
public static void main(String[] args) {
	System.out.println("start");
	
	String s=null;
	
	try {
		
		System.out.println(s.length());
		
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("arithmetic exception");
	}
	
	
	//catch (String IndexOutOfBoundException e) {
		// TODO: handle exception
		//System.out.println("string index out of bound exception");
	//}
	
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("null pointer exception");
		
	}
	
	finally {
		System.out.println("success block");
	}
	
	
	
	System.out.println("end");
	
	
	
	
}
}
