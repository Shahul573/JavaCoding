package org.excptn.test;

public class Company {
	
	public static void main(String[] args) {
		
		//try catch finally combination
		
		System.out.println("start");
		String s=null;
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("dont divided by zero");
		}
		
		finally {
			System.out.println("success block");
		}
		
		System.out.println("End");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
