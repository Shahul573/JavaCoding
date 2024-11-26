package org.cnst.tcs;

public class Constrctr {

	//default constructor
	public  Constrctr() {
		System.out.println("default constructor");
	}
	
	//parameterized constructor
	
	public  Constrctr(int id) {
		System.out.println("int para constructor "+id);
	}
	
	private void empId() {
		// TODO Auto-generated method stub
System.out.println("method");
	}
	
	public static void main(String[] args) {
		
		Constrctr a=new Constrctr();
		Constrctr a1=new Constrctr(44567);
		a.empId();
		
		
		
		
		
		
	}
	
	
	
	
	
}
