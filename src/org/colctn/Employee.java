package org.colctn;

import java.util.ArrayList;
import java.util.List;

public class Employee {
public static void main(String[] args) {
	
	List<Integer> li=new ArrayList<>();
	
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(70);
	li.add(40);
	li.add(50);
	li.add(10);
	
	System.out.println(li);
	
	int size = li.size();
	System.out.println(size);
	
	Integer integer = li.get(1);
	System.out.println(integer);
	
	li.add(4, 35);
	
	System.out.println(li);
	
	li.set(5, 45);
	System.out.println(li);
	
	//to check whether value is present or not
	
	boolean contains = li.contains(50);
	System.out.println(contains);
	
	int indexOf = li.indexOf(10);
	System.out.println(indexOf);
	
	int lastIndexOf = li.lastIndexOf(10);
	System.out.println(lastIndexOf);
	
	boolean empty = li.isEmpty();
	System.out.println(empty);
	
	li.remove(5);
	System.out.println(li);
	
	li.clear();
	System.out.println(li);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
