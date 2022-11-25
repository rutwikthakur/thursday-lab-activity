package com.question2;

public class ArithmaticMain {

	public static void main(String[] args) {
	
		Adder a=new Adder();
		System.out.println("My superclass is:"+a.getClass().getSuperclass().getName());
		System.out.print(a.add(10,30)+" ");

	}

}
