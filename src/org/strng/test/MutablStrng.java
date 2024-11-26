package org.strng.test;

public class MutablStrng {
	public static void main(String[] args) {
		
		System.out.println("mutable string");
		
		StringBuffer s=new StringBuffer("hello");
		System.out.println(s);
		int x = System.identityHashCode(s);
		System.out.println(x);
		
		
		StringBuffer s1=new StringBuffer("java");
		System.out.println(s1);
		int y = System.identityHashCode(s1);
		System.out.println(y);
		
		StringBuffer append = s.append(s1);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
		
		
		
		
		
		
		
		
		
		
	}

}
