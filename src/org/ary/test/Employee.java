package org.ary.test;

import java.util.Iterator;

public class Employee {
	public static void main(String[] args) {
		
		//data type variable[]=new data type[size]
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		System.out.println(a[2]);
		//to find the length
		int length = a.length;
				
		System.out.println(length);
		
		//to iterate the values
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	
		System.out.println("for each");
		
		for (int i : a) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
