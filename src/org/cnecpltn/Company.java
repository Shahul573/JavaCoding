package org.cnecpltn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.encpsultn.Encapsultn;


public class Company {

	public static void main(String[] args) {
		List<Encapsultn> l=new ArrayList<Encapsultn>();
		
	Encapsultn a=new Encapsultn();	
		
	a.setId(12345);
	a.setName("greens");
	a.setPhno(8056692984l);
		
	//to insert 2nd employ information
	
	Encapsultn a1=new Encapsultn();
	a1.setId(5678);
	a1.setName("tech");
	a1.setPhno(9677488068l);	
		
	l.add(a1);
	l.add(a1);
	
	//for (int i = 0; i < l.size(); i++) {
		
		//System.out.println(l.get(i).getId());
		//System.out.println(l.get(i).getName());
		//System.out.println(l.get(i).getPhno());
		
		
	//}
	
	for (Encapsultn x : l) {
		
		System.out.println(x.getId());
		System.out.println(x.getName());
		System.out.println(x.getPhno());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
}
