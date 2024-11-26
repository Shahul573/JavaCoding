package org.info;

public class Client implements Par1,Par2{

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
	System.out.println("test1");	
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}
public static void main(String[] args) {
	Client a=new Client();
	a.test1();
	a.test2();
	a.test3();
}
	
}
