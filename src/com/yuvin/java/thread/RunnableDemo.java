package com.yuvin.java.thread;

public class RunnableDemo  {

    // Thread start complicated
	// run() -> void 
	// I can't create Thread pool
   
    
    
    public static void main(String[] args) {
	
    	Runnable r =  () -> System.out.println("Inside : " + Thread.currentThread().getName());
    	
    	new Thread(r).start();
    	new Thread(r).start();
	}
}
