package org.excptn.test;

public class Compnyyyy {
	
	public static void main(String[] args) {
		
		//try with multiple catch combination
		System.out.println("start");
		String s=null;
		
		try {
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception");
		}
		
		//catch (string IndexOutOfBoundException e) {
			// TODO: handle exception
			
			//System.out.println("string index out of bound exception");
			
		//}
		
		catch (NullPointerException e) {
			

		System.out.println("null pointer exception");
		}
		finally {
			System.out.println("sucess blk");
			
		}
		System.out.println("end");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
