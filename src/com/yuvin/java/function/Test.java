package com.yuvin.java.function;

public class Test {
	
	public static void main(String[] args) {
		
		//Calculator cal1 = new CalculatorImpl();
		//System.out.println(cal1.square(10));		
		
		
		
	Calculator cal2 = value -> (value * value);
		
	System.out.println(cal2.square(10));
	
		

	}
	
	

}
