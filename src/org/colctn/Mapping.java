package org.colctn;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapping {
public static void main(String[] args) {
	
	Map<Integer, String> m=new LinkedHashMap<Integer, String>();
	
	m.put(10, "java");
	m.put(20, "sql");
	m.put(30, "sql");
	m.put(40, "selenium");
	m.put(50, "ruby");
	m.put(10, "python");
	
	int size = m.size();
	System.out.println(size);
	//to get the particular value
	String string = m.get(20);
	System.out.println(string);
	
	//to display the keys only
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
	
	//to display the values only
	Collection<String> values = m.values();
	System.out.println(values);
	
	boolean containsKey = m.containsKey(20);
	System.out.println(containsKey);
	
	boolean containsValue = m.containsValue("java");
	System.out.println(containsValue);
	
	boolean empty = m.isEmpty();
	System.out.println(empty);
	
	m.remove(20);
	System.out.println(m);
	
	m.clear();
	System.out.println(m);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
