package org.abstrtn;

public class GreenBank extends ICICI {

	@Override
	void savings() {
		// TODO Auto-generated method stub
	System.out.println("7%");	
	}

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("8%");
	}

	
	public static void main(String[] args) {
		
		GreenBank a=new GreenBank();
		a.savings();
		a.deposit();
		a.fixed();
		
		
		
		
		
	}
	
	
	
	
}
