package org.abstrtn;

public class Hdfc implements Iob {

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("5%");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("6%");
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("7%");
	}
	public static void main(String[] args) {
	
		Hdfc c=new Hdfc();
		c.fixed();
		c.deposit();
		c.savings();

		
		
		
		
	}
		
	
	
	
	

}
