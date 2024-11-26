package org.strng.test;

public class ImmutbleStrng {
	public static void main(String[] args) {
	System.out.println("immutable string");	
	String s="hello";
	System.out.println(s);
	int x = System.identityHashCode(s);
	System.out.println(x);
	
	
	String s1="java";
	System.out.println(s1);
	int y = System.identityHashCode(s1);
	System.out.println(y);
	
	String concat = s.concat(s1);
	System.out.println(concat);
	
	int z = System.identityHashCode(concat);
	System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
