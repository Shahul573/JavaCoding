package org.strng.test;

public class CourseDetail {
	public static void main(String[] args) {
		
		System.out.println("literal string");
		
		
		String s="java";
		System.out.println(s);
		
		int x = System.identityHashCode(s);
		System.out.println(x);
		
		String s1="java";
		System.out.println(s1);
		int y = System.identityHashCode(s1);
		System.out.println(y);
		
		String s2="selenium";
		System.out.println(s2);
		int z = System.identityHashCode(s2);
		
		System.out.println(z);
	}

}
