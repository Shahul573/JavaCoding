package org.colctn;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapeter {
public static void main(String[] args) {
	
	
Map<Integer, String> m=new LinkedHashMap<Integer, String>();
	
	m.put(10, "java");
	m.put(20, "sql");
	m.put(30, "sql");
	m.put(40, "selenium");
	m.put(50, "ruby");
	m.put(10, "python");
	
	
	System.out.println(m);
	
	
	
	Set<Entry<Integer,String>> entrySet = m.entrySet();
	System.out.println(entrySet);
	
	for (Entry<Integer, String> x : entrySet) {
		System.out.println(x);
		System.out.println(x.getKey());
		System.out.println(x.getValue());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
