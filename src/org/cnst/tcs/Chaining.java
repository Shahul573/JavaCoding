package org.cnst.tcs;

public class Chaining extends Company {
	
	public  Chaining() {
		// TODO Auto-generated method stub

		super("tech");
		System.out.println("default constructor");
		
		}
	
	
	public  Chaining(int id) {
		// TODO Auto-generated method stub

		this(8056692984l);
		System.out.println("int para constructor "+id);
		
		}
	
	public  Chaining(String name) {
		// TODO Auto-generated method stub

		
		System.out.println("string para constructor"+name);
		
		}
	
	public  Chaining(long phnno) {
		// TODO Auto-generated method stub

		this("greens");
		System.out.println("long para constructor "+phnno);
		
		}
	
	public static void main(String[] args) {
		Chaining c=new Chaining();
		
	}
	
	
	
	

}
