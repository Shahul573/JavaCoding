package org.excptn.test;

public class ExcptnHan {
	
	public static void main(String[] args) {
		//arithmetic exception
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3/0);	
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("dont divided by zero");
			
			
		}
		
		
		
		
		
		System.out.println(4);
		
		System.out.println(5);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
