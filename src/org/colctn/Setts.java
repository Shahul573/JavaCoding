package org.colctn;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setts {
public static void main(String[] args) {
	
	Set<Integer> s=new LinkedHashSet<Integer>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(10);
	
	System.out.println(s);
	
	
	int size = s.size();
	System.out.println(size);
	
	boolean contains = s.contains(20);
	System.out.println(contains);
	
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	s.remove(30);
	System.out.println(s);
	
	//s.clear();
	//System.out.println(s);
	
	//to iterate the values
	for (Integer x : s) {
		System.out.println(x);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
