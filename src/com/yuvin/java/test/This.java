package com.yuvin.java.test;

public class This {
	int a = 10;

	This() {
		int a = 5;
		this.a--;
	}

	public static void main(String[] args) {
		This o = new This();
		System.out.println(o.a);
	}
}