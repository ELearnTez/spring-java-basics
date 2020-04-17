package com.yuvin.java.function;

public class Main {
	
	
	static int id=10;//class Loading into
	
	//JDBC class Loading
	static {
		System.out.println("Static Block1");
	}
	
	//JDBC class Loading
	static {
			System.out.println("Static Block2");
	}
	
	
	{
		System.out.println("instance block1");
	}
	
	{
		System.out.println("instance block2");
	}
	
	//instance variable
	String name  = null; // default value
	
	
	public  static void main(String[] args) {
	 System.out.println("Hello . Welcome to Java...!");

	 Main  main = new Main();
	 
	 
	 System.out.println(main);
	}
 

}
