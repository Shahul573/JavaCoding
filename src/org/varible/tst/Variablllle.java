package org.varible.tst;

import java.lang.foreign.AddressLayout;

public class Variablllle {

	private void add() {
		//local variable		
		int a=10;
System.out.println("a in method "+a);
	}
	
	
	public static void main(String[] args) {
		int a=20;
		System.out.println("a in main method "+a);
		
		Variablllle b=new Variablllle();
		b.add();
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
