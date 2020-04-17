package com.yuvin.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        Callable<String> r = () ->  "Hey new Thread..!"+ Thread.currentThread().getName(); // task

        System.out.println("Hey Main Thread..!"+ Thread.currentThread().getName());
        
        
        Future<String> msg = executorService.submit(r);
        
        
        while(!msg.isDone()) {
        	System.out.println("Wait ..!");
        }
        
        System.err.println(msg.get());
        
        
        executorService.shutdown();

    }

}
