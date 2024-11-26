package org.poly;

public class GreenBank extends Icici{
public void savings() {
	// TODO Auto-generated method stub
System.out.println("7%");
}


private void fixed() {
	// TODO Auto-generated method stub
System.out.println("8%");
}

public static void main(String[] args) {
	GreenBank a=new GreenBank();
	a.savings();
	a.fixed();
	a.deposit();
}


}
