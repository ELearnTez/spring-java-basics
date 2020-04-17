package com.yuvin.java.annotation;

@Author
public class Test1 {


	@Author(author = "Yuvin", version = "1.0.1")
	public String sayHello() {
		return "Hello Friend. Welcome to Java Annotation";

	}

}
