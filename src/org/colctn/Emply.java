package org.colctn;

import java.util.ArrayList;
import java.util.List;

public class Emply {
public static void main(String[] args) {
	
	List<Integer> li=new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	li.add(10);
	
	System.out.println(li);
	
	
	
	List<Integer> l=new ArrayList<Integer>();
	l.addAll(li);
	System.out.println(l);
	
	l.add(100);
	l.add(200);
	
	System.out.println(l);
	
	
	l.removeAll(li);
	System.out.println(l);
	
	l.retainAll(li);
	System.out.println(l);
	
	
	
}
}
