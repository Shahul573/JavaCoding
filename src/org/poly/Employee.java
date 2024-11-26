package org.poly;

public class Employee {
//data type
	private void empDetails(String name) {
		// TODO Auto-generated method stub
System.out.println("Employee name: "+name);
	}
	
	//data type order
	
	private void empDetails(String name,int id) {
		// TODO Auto-generated method stub
System.out.println("Employee name: "+name+"\n"+"Employee id: "+id);
	}
	
	
	private void empDetails(int atmPin,String address) {
		// TODO Auto-generated method stub
System.out.println("Employee atmpin: "+atmPin+"\n"+
		"Employee address is: "+address
		
		);


	}
	//data type count
	
	private void empDetails(int bikeNo,String email,long phnNo) {
		// TODO Auto-generated method stub
System.out.println("employee bike number: "+bikeNo+
		
		"\n"+"employee email: "+email+"\n"+"Employee phone number: "+phnNo
		);
	}
	
	public static void main(String[] args) {
		
		Employee a=new Employee();
		a.empDetails("shahul");
		
		a.empDetails("ronaldo",1234 );
		
		a.empDetails(1234, "omr chennai");
		
		a.empDetails(0005, "crshahul11@gmail.com", 8056692984l);
		
		a.empDetails("messi",7890);
		a.empDetails("vijay");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
