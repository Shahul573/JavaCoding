package org.colctn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Empleee {
public static void main(String[] args) {
	
	List<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	li.add(10);
	
	System.out.println(li);
	
	
	for (int i = 0; i < li.size(); i++) {
		Integer integer = li.get(i);
		System.out.println(integer);
	}
	
	for (Integer x : li) {
		System.out.println(x);
	}
	
	
	
	
	
	
	
}
}
