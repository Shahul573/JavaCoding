package org.varible.tst;

public class Varible {
	
	int a=10;
	//static variable
	
	static int b=10;
	private void add() {
		// TODO Auto-generated method stub
System.out.println(a);
System.out.println(b);

		a++;
		b++;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Varible c=new Varible();
		c.add();
		
		Varible c1=new Varible();
		c1.add();
		
		Varible c2=new Varible();
		c2.add();
		
		
		
	}
	
	
	
	
	

}
