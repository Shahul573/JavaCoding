package org.colctn;

import java.util.ArrayList;
import java.util.List;

public class Employ {
public static void main(String[] args) {
	
	List li=new ArrayList();
	//to add the values
	
	li.add(10);
	li.add("java");
	li.add('M');
	li.add(true);
	li.add(987.987f);
	li.add(10);
	System.out.println(li);
	
	int size = li.size();
	System.out.println(size);
	
	//to get particular value
	Object object = li.get(1);
	System.out.println(object);
	
	
	
	
	
	
	
	
	
	
}
}
