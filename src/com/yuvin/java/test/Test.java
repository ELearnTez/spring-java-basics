package com.yuvin.java.test;

public class Test {

	static {
		System.out.println("1");
	}

	static String sayHello = sayHelloMsg();
	
	static {
		System.out.println("3");
	}
	
	//immutable
	
	public static void main(String[] args) {
		System.out.println("main");
	}
	
	private static String sayHelloMsg() {
		System.out.println("2");
		return "Hi";
	}

}